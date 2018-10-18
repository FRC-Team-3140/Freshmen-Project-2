package org.usfirst.frc.team3140.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public interface Constants {
		//assigning xbox ports
		public final int Xbox_Port = 0;
		public final int Xbox_Port2 = 1;
		//assigning intake motors
		public final int LEFT_Intake = 1;
		public final int RIGHT_Intake = 0;
		
		//constants
		public final DoubleSolenoid.Value EXT = Value.kForward;
		public final DoubleSolenoid.Value RET = Value.kReverse;
		public final DoubleSolenoid.Value OFF = Value.kOff;
		
		// TALON CONTROL MODES
		public final ControlMode SLAVE_MODE = ControlMode.Follower;
		public final ControlMode PERCENT_VBUS_MODE = ControlMode.PercentOutput;
		public final NeutralMode BRAKE_MODE = NeutralMode.Brake;
		public final ControlMode POSITION_MODE = ControlMode.Position;
		public final DemandType ARB_FEED_FORWARD = DemandType.ArbitraryFeedForward;
		
		public static enum TurnMode {Right, Left};
		// length of robot
		public final double robotLength = 38.5;
		// subtracted from last move on auto
		public final double safetyFactor = 4.0;
		
	
	
}
 