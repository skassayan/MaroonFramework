package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.mechanisms.Intake;
import com.team766.frc2020.Robot;

public class StartIntake extends Procedure {

	public void run(Context context) {
		context.takeOwnership(Robot.launcher);
		Robot.intake.moveIntake(true);
		context.waitForSeconds(0.25);
		Robot.intake.moveExtender(1);
	}
}