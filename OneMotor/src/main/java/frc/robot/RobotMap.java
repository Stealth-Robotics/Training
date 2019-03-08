/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  public static final int mainMotor = 4;

  public static WPI_TalonSRX mainMotorController;


  public static void init()
  {
    mainMotorController = new WPI_TalonSRX(RobotMap.mainMotor);
    RobotMap.mainMotorController.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,0,20);
  }
}
