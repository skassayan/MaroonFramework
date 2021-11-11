package com.team766.frc2020.mechanisms;
import com.team766.framework.Mechanism;
import com.team766.hal.PositionReader;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;

public class RobotPosition extends Mechanism {
	
	private PositionReader m_positionSensor = RobotProvider.instance.getPositionSensor();

	public double getX() {
		return m_positionSensor.getX()*3.28084;
	}

	public double getY() {
		return m_positionSensor.getY()*3.28084;
	}

	public double getHeading() {
		return m_positionSensor.getHeading();
	}
	
	public void run() {
		loggerCategory = Category.RACCOON;
		log("RobotPosition  X: %f  Y: %f  Heading: %f",   m_positionSensor.getX(), m_positionSensor.getY(), m_positionSensor.getHeading());
	}
}