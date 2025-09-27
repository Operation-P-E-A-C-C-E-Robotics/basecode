// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.Intake.*;
import frc.robot.commands.IntakeyWakey;

public class Intake extends SubsystemBase {
  public static Spark rightMotor = new Spark(rightRoller);
  public static Spark leftMotor = new Spark(leftRoller);
  private IntakeyWakey  m_IntakeyWakey;
  /** Creates a new Intake. */
  public Intake() {
  
  }
  public void Vroom()
  {
    SetAllMotors(motorIntakeSpeed, motorIntakeSpeed);
  }

  public void SetAllMotors(double rightMotorValue, double leftMotorValue)
  {
    rightMotor.set(rightMotorValue);
    leftMotor.set(leftMotorValue);
  }

  public void StopAllMotors() //Just in case
  {
    SetAllMotors(0, 0);
  }

  @Override
  public void periodic() {
    if(m_IntakeyWakey.isIntaking.getAsBoolean())
    {
      Vroom();
    }
  }
}
