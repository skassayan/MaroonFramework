package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.frc2020.mechanisms.Flyswatter;

public class Whack extends Procedure {
	public void run(Context context) {
		context.takeOwnership(Robot.flyswatter);

		Robot.flyswatter.setFlyswatterPower(1.0);

		context.waitForSeconds(1.0);

		Robot.flyswatter.setFlyswatterPower(-1.0);

		context.waitForSeconds(1.0);

		Robot.flyswatter.setFlyswatterPower(0.0);
	}
}