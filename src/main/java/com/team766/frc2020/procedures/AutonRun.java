package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;

public class AutonRun extends Procedure {
	public void run(Context context) {
		new DriveStraight(1.25, true).run(context);
		new Whack().run(context);
		new TurnRight().run(context); 
		new DriveStraight(1.75, false).run(context);
		new TurnRight().run(context); 
		new DriveStraight(0.45, true).run(context);
		new Whack().run(context);
		new TurnRight().run(context);
		new DriveStraight(1.55, false).run(context);
		new TurnLeft().run(context);
		new DriveStraight(1.75, true).run(context);
		new Whack().run(context);
		new TurnLeft().run(context);
		new DriveStraight(2.15, false).run(context);
		new TurnRight().run(context);
		new Whack().run(context);
		new Wait().run(context);
		new TurnRight().run(context);
		new DriveStraight(3.7, false).run(context);
		new TurnRight().run(context);
		new DriveStraight(0.4, true).run(context);
		new Whack().run(context);
		new TurnRight().run(context);
		new DriveStraight(0.4, false).run(context);
		new TurnLeft().run(context);
		new DriveStraight(1.0, false).run(context);
		new TurnLeft().run(context);
		new DriveStraight(0.3, false).run(context);
	}
}