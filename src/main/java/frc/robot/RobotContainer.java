// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import static frc.robot.Constants.Intake.intakeButtonID;

import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.*;
import edu.wpi.first.wpilibj.XboxController.*;
import frc.robot.commands.IntakeyWakey;
import frc.robot.subsystems.Intake;
import static frc.robot.Constants.Intake.*;

import frc.robot.subsystems.Shooter;

//import frc.lib.util.ButtonMap;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Joystick driverJoystick = new Joystick(0);
  private final Joystick operatorJoystick = new Joystick(1);
  private final Drivetrain m_drivetrain = new Drivetrain();
  private final Drive m_drive = new Drive(m_drivetrain);
  private final Intake m_Intake = new Intake();
  private final IntakeyWakey m_IntakeyWakey = new IntakeyWakey(m_Intake);
  private final Shooter m_Shooter = new Shooter();
 // private final ShootMaBooty m_ShootMaBooty = new ShootMaBooty(m_Shooter);
  private final Command m_autoCommand = new Autonomous(m_drivetrain);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    m_drive.withLeft(() -> driverJoystick.getRawAxis(0)).withRight(() -> driverJoystick.getRawAxis(1));

    m_IntakeyWakey.ActivateVroom(() -> driverJoystick.getRawButton(intakeButtonID));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }

  //private final OIEntry[]

  // private final OIEntry[] operatorsMap = new OIEntry[] {
  //   Button.onHold(sushi.place(() -> (elevator.getHeight() < 5.0) && (elevator.getHeight() > 1.5)), 8),
  //   Button.onHold(sushi.intake(), 7),
  //   Button.onHold(chute.intake(), 7),
  //   Button.onRelease(chute.rest(), 7),
  //   Button.onHold(chute.unjam().alongWith(sushi.panic()), 5),
  //   Button.onRelease(chute.rest(), 5),
    
  //   Button.onHold(automationCommands.l1ElevatorWrist(), 3),
  //   Button.onHold(automationCommands.l2ElevatorWrist(), 2),
  //   MultiButton.onHold(automationCommands.l2_5ElevatorWrist(), 9, 2), //
  //   Button.onHold(automationCommands.l3ElevatorWrist(), 1),
  //   MultiButton.onHold(automationCommands.l3_5ElevatorWrist(), 9, 1), // TODO PARKER Do The Buttons
  //   Button.onHold(automationCommands.l4ElevatorWrist(), 4),
    
  //   MultiButton.onHold(climber.deploy(), 9, 10),
  //   MultiButton.onHold(chute.dropCommand(), 9, 10),
    
  //   Button.onPress(elevator.goToSetpoint(ElevatorSetpoints.REST),12),
  //   Button.onPress(wrist.goToSetpoint(WristSetpoints.REST),12),
    
  //   JoystickTrigger.onMove(operatorJoystick, elevator.manualInput(() -> -operatorJoystick.getRawAxis(3)*0.3), 3, 0.15),
  //   JoystickTrigger.onMove(operatorJoystick, wrist.manualInput(() -> -operatorJoystick.getRawAxis(1)*0.3), 1, 0.15),
  //   JoystickTrigger.onMove(operatorJoystick, climber.manualInput(() -> -operatorJoystick.getRawAxis(0)*0.5), 0, 0.2),
  // };
  
}
