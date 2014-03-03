package edu.wpi.first.wpilibj.templates;
// author Johnathon
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int elevMotor = 1;
    public static final int elevMotor2 = 2;
    public static final int catMSStart = 1;
    public static final int catMSEnd = 1;
    public static final int intakeRollerL = 3;
    public static final int intakeRollerR = 4;
    public static final int winMotor = 5;
    public static final int inMSStart = 3;
    public static final int inMSEnd = 4;
    public static final int hotSpeed = 2;
    public static final int hotSpeedAfter = 3;
    public static final int hotSpeedElse = 5;
    public static final double hotShotBefore = 0.5;
    public static final double hotShotElse = 0.4;
    public static final double slowShot = 0.3;
    public static final double fastShot = 0.7;
    public static final double moveForwardSpeed = 0.5;
    public static final double unloadSpeed = 0.5;
    public static final double reloadSpeed = -0.5;
    public static final double intakeSpeed = 0.5;

// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
