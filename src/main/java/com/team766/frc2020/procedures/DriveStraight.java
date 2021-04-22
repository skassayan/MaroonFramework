package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;

public class DriveStraight extends Procedure {

	private double driveTime;
	private boolean stop;
	private double n;
	public DriveStraight(double time, boolean pause) {
		driveTime = time;
		stop = pause;
		if(stop = true) {
			n = 1.0;
		} else {
			n = 0.0;
		}
	}

	public void run(Context context) {
		/* context.takeOwnership(Robot.drive);

		Robot.drive.setDrivePower(0.5, 0.5);

		context.waitForSeconds(driveTime);

		Robot.drive.setDrivePower(0.0, 0.0);

		context.waitForSeconds(n); */
		new StartIntake().run(context);
		new StopIntake().run(context);
	}
}