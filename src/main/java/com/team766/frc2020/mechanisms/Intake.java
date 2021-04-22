package com.team766.frc2020.mechanisms;
 
import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SolenoidController;
import com.team766.hal.SpeedController;

public class Intake extends Mechanism {
	private SolenoidController m_intakeArm;
	private SpeedController m_intakeWheels;
 
	public Intake() {
		m_intakeArm = RobotProvider.instance.getSolenoid("intakeArm");
		m_intakeWheels = RobotProvider.instance.getMotor("intakeWheels");
	}
 
	public void moveIntake(boolean extended) {
		checkContextOwnership();
 
		m_intakeArm.set(extended);
	}
	public void moveExtender(double power) {
		checkContextOwnership();
		m_intakeWheels.set(power);
	}
}
