// LEFT ARM
package com.team766.frc2020.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;

public class arm2 extends Mechanism {
	private SpeedController arm2Motor;
	public arm2() {
		arm2Motor = RobotProvider.instance.getMotor("leftArm");
	}
	public void armIn() {
		checkContextOwnership();
		arm2Motor.set(0.2);
	}
	public void armOut() {
		checkContextOwnership();
		arm2Motor.set(-0.2);
	}
	public void armStop() {
		checkContextOwnership();
		arm2Motor.set(0);
	}
}