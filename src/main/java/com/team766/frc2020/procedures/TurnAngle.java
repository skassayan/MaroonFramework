package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.frc2020.Drive;

public class TurnAngle extends Procedure {
	private double Angle;
	
	public TurnAngle(double angle) {
		Angle = angle;
	}

	public void run(Context context) {
		context.takeOwnership(Robot.drive);

		Robot.drive.setDrivePower(0.25, -0.25);

		if (Robot.drive.getGyroAngle() >= -Angle/2) {
			Robot.drive.setDrivePower(0.1, -0.1);
		}
		if (Robot.drive.getGyroAngle() >= -Angle*(8/9)) {
			Robot.drive.setDrivePower(0.01, -0.01);
		}
		if (Robot.drive.getGyroAngle() >= -Angle) {
			Robot.drive.setDrivePower(0.0, 0.0);
		}
	}
}