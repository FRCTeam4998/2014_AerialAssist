package edu.wpi.first.wpilibj.templates;
// author Johnathon
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //ports for Victors
    
    public static final int elevMotor = 3;
    /**
    Currently used in: Catapult.java subsystem
    */
    public static final int elevMotor2 = 4;
    /**
    Currently used in: Catapult.java subsystem
    */    
    public static final int intakeRollerL = 5;
    /**
    Currently used in: Intake.java subsystem
    */
    public static final int intakeRollerR = 6;
    /**
    Currently used in: Intake.java subsystem
    */
    public static final int winMotor = 7;    
    /**
    Currently used in: Intake.java subsystem
    */    
    
    //ports for DigitalInputs

    public static final int catMSStart = 2;
    /**
    Currently used in: Catapult.java subsystem
    */
    public static final int catMSEnd = 1;
    /**
    Currently used in: Catapult.java subsystem
    */
    public static final int inMSStart = 3;
    /**
    Currently used in: Intake.java subsystem
    */
    public static final int inMSEnd = 4;    
    /**
    Currently used in: Intake.java subsystem
    */
    
    
    /*
    settings used by the robot
    */
    
    public static final double autonMoveSpeed = 0.5;
    /**
    Currently used in: DriveForTime.java command
    */
    public static final double autonShot = 0.5;
    /**
    Currently used in: AutonCommandGroup.java command group
    */
    public static final double lowShot = 0.4;
    /**
    Currently used in: RobotTemplate.java
    */
    
    public static final double highShot = 0.7;
    /**
    Currently used in: RobotTemplate.java
    */
    

    public static final double unloadSpeed = 0.5;
    /**
    Currently used in: Unload.java command
    */
    
    public static final double reloadSpeed = -0.5;
    /**
    Currently used in: Reload.java command
    */
    
    public static final double intakeSpeed = 0.5;
    /**
    Currently used in: ToggleRollerSpeed.java
    *                  Spit.java
    */
    
// For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
