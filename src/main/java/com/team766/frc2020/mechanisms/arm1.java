// RIGHT ARM
package com.team766.frc2020.mechanisms;
 
import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;

public class arm1 extends Mechanism {
	private SpeedController arm1Motor;
	public arm1() {
		arm1Motor = RobotProvider.instance.getMotor("rightArm");
	}
	public void armIn() {
		checkContextOwnership();
		arm1Motor.set(0.2);
	}
	public void armOut() {
		checkContextOwnership();
		arm1Motor.set(-0.2);
	}
	public void armStop() {
		checkContextOwnership();
		arm1Motor.set(0);
	}
}