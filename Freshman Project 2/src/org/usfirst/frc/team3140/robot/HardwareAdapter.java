package org.usfirst.frc.team3140.robot;

import edu.wpi.first.wpilibj.Spark;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;



public interface HardwareAdapter extends Constants {
		//Intake
		public static Spark leftIntakeMotor = new Spark(LEFT_Intake);
		public static Spark rightIntakeMotor = new Spark(RIGHT_Intake);
		
		
		

}


