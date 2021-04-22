package com.team766.frc2020.procedures;
 
import com.team766.framework.Procedure;
import com.team766.frc2020.mechanisms.LineSensors;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.frc2020.Drive;
 
public class FollowLine extends Procedure {
 
	public void run(Context context) {
		context.takeOwnership(Robot.drive);
		context.takeOwnership(Robot.linesensors);
 
		while (true) {
			if(Robot.linesensors.getLineSensorLeft() == true) {
				Robot.drive.setArcadeDrivePower(0.2, 0.15);
			} else if(Robot.linesensors.getLineSensorRight() == true) {
				Robot.drive.setArcadeDrivePower(0.15, 0.2);
			} else if(Robot.linesensors.getLineSensorCenter() == true) {
				Robot.drive.setArcadeDrivePower(0.2, 0.2);
			}
 
			context.yield();
		}
	}
 
}
