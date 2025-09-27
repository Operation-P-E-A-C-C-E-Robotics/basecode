// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.CommandBase.*;
//import frc.robot.Constants.Intake;
//import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class IntakeyWakey extends CommandBase {
  private final Intake intake;
  public BooleanSupplier            //
  isIntaking = () -> false;        //
  /** Creates a new IntakeyWakey. */
  public IntakeyWakey(Intake i) {
    intake = i;
    addRequirements(i);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {}

  public IntakeyWakey ActivateVroom(BooleanSupplier intakeButtonDown)
  {
    isIntaking = intakeButtonDown;
    return this;
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
