// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveBase
    {
       //MOTOR CANIDS
        public static final int Rdrive = 2;//CAN
        public static final int Rfollow = 3; //CAN
        public static final int Ldrive = 0; //CAN
        public static final int Lfollow = 1;  //CAN
    }

    public static final class Intake
    {
        //MOTOR CANIDS
        public static final int rightRoller = 0;// PWM
        public static final int leftRoller = 1;// PWM
        public static final double motorIntakeSpeed = 0.3;
        public static final int intakeButtonID = 3;
        //DEPLOY IS 2 BTW BUT I DONT THINK ITS TECHNICALLY IN THE INTAKE SUBSYSTEM, UR GONNA HAVE TO MAKE ONE JUST FOR DEPLOY (pmw too btw)
    }

    public static final class Shooter
    {
        //MOTOR CANIDS
        public static final int shootOne = 6; //hehehehehehe also CAN
        public static final int shootTwo = 7; //hehehehhehehehehehehhehehhehehhe also CAN
    }
}
