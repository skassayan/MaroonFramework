package com.team766.frc2020.procedures;
import com.team766.frc2020.procedures.DriveDistance;
import com.team766.frc2020.procedures.TurnAngle;
import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.logging.Category;

public class GoToCoordinate {
	private double CoordinateX;
	private double CoordinateY;

	public GoToCoordinate(double coordinateX, double coordinateY) {
		CoordinateX = coordinateX;
		CoordinateY = coordinateY;

	}

	public void run(Context context) {
		double coordinateAngle = Math.toDegrees(Math.atan2(CoordinateY, CoordinateX));
		double coordinateDistance = Math.sqrt(CoordinateX*CoordinateX + CoordinateY*CoordinateY);
		context.takeOwnership(Robot.drive);
		new TurnAngle(coordinateAngle).run(context);
		new DriveDistance(coordinateDistance).run(context);
	}
}