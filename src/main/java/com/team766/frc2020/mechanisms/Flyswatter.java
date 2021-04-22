package com.team766.frc2020.mechanisms;
 
import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;
 
public class Flyswatter extends Mechanism {
  private SpeedController m_flyswatterMotor;
   	public Flyswatter() {
		m_flyswatterMotor = RobotProvider.instance.getMotor("weapon");
  	}

	   
	public void setFlyswatterPower(double power) {
		checkContextOwnership();
		
		m_flyswatterMotor.set(power);
	}
}

