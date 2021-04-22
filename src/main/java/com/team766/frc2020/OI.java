package com.team766.frc2020;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.frc2020.procedures.*;
import com.team766.hal.JoystickReader;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the code that allow control of the robot.
 */

public class OI extends Procedure {
	private JoystickReader m_joystick0;
	private JoystickReader m_joystick1;
	private JoystickReader m_joystick2;
	
	public OI() {
		loggerCategory = Category.OPERATOR_INTERFACE;

		m_joystick0 = RobotProvider.instance.getJoystick(0);
		m_joystick1 = RobotProvider.instance.getJoystick(1);
		m_joystick2 = RobotProvider.instance.getJoystick(2);
	}
	
	public void run(Context context) {
		log("Sina");
		context.takeOwnership(Robot.drive);
		context.takeOwnership(Robot.flyswatter);

		while (true) {
			// Add driver controls here - make sure to take/release ownership
			// of mechanisms when appropriate.
			Robot.drive.setArcadeDrivePower(m_joystick0.getAxis(1), m_joystick0.getAxis(0));   //WASD
			if (m_joystick0.getButtonPressed(2)) {
				context.startAsync(new Launch());
			}
			if (m_joystick0.getButtonPressed(1)) {
				context.startAsync(new StartIntake());
			}
			/*if (m_joystick0.getButtonPressed(2)) {   //Left Shift
				context.startAsync(new Whack());
			}*/
			log("J0 A0: " + m_joystick0.getAxis(0) +
			"  J0 A1: " + m_joystick0.getAxis(1) +
			"  J1 A0: " + m_joystick1.getAxis(0) +
			"  J1 A1: " + m_joystick1.getAxis(1) +
			"  J0 B1: " + m_joystick0.getButton(1) +
			"  J0 B2: " + m_joystick0.getButton(2) +
			"  J0 B3: " + m_joystick0.getButton(3));
			context.waitFor(() -> RobotProvider.instance.hasNewDriverStationData());
		}
	}
}
