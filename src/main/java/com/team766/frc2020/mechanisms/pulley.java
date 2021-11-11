package com.team766.frc2020.mechanisms;
 
import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;

public class pulley extends Mechanism {
	private SpeedController pulleyMotor;
	public pulley() {
		pulleyMotor = RobotProvider.instance.getMotor("pulleyMotor");
	}
	public void pulleyUp() {
		checkContextOwnership();
		pulleyMotor.set(0.2);
	}
	public void pulleyDown() {
		checkContextOwnership();
		pulleyMotor.set(-0.2);
	}
	public void pulleyStop() {
		checkContextOwnership();
		pulleyMotor.set(0);
	}
}