package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;

public class Wait extends Procedure {

	public void run(Context context) {
		context.takeOwnership(Robot.drive);

		context.waitForSeconds(1.0);

	}
}