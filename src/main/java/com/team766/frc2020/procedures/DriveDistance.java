package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;

public class DriveDistance extends Procedure {
	private double Distance;

	public DriveDistance(double distance) {
		Distance = distance;
	}

	public void run(Context context) {
		context.takeOwnership(Robot.drive);

		Robot.drive.resetEncoders();

		Robot.drive.setDrivePower(0.25, 0.25);

		context.waitFor(() -> Robot.drive.getEncoderDistance() >= Distance);

		Robot.drive.setDrivePower(0.0, 0.0);
	}
}