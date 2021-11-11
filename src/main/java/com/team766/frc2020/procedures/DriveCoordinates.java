package com.team766.frc2020.procedures;
import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.logging.Category;

public class DriveCoordinates extends Procedure {
    public void run(Context context) {
		new GoToCoordinate(10, 0).run(context);
		new GoToCoordinate(10, 10).run(context);
		new GoToCoordinate(-10, 10).run(context);
		new GoToCoordinate(-10, -10).run(context);
		new GoToCoordinate(10, -10).run(context);
		new GoToCoordinate(10, 0).run(context);
	}
}
