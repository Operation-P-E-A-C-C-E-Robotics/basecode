// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.Shooter.*;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Shooter extends SubsystemBase {
  public final TalonSRX motorOne = new TalonSRX(shootOne);
  public final TalonSRX motorTwo = new TalonSRX(shootTwo);
  /** Creates a new Shooter. */
  public Shooter() 
  {

  }

  public void Shoot()
  {
    //Put Stuff here
  }

  @Override
  public void periodic() 
  {
  
  }
}
