package com.team766.frc2020.procedures;
import com.team766.framework.Procedure;
import com.team766.logging.Category;
import com.team766.framework.Context;

public class DriveSquare extends Procedure {
	public DriveSquare() {
		loggerCategory = Category.AUTONOMOUS;
	}
	public void run(Context context) {
		for(int i = 0; i < 4; ++i) {
			new DriveStraight(1, true).run(context);
			new TurnAngle().run(context);
			//new TurnRight().run(context);
			log("Yay, you drove in a square");
		}
	}
}