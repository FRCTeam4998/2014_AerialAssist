/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.AutonCommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.templates.commands.Reload;
import edu.wpi.first.wpilibj.templates.commands.Shoot;
import edu.wpi.first.wpilibj.templates.commands.Spitting;
import edu.wpi.first.wpilibj.templates.commands.ToggleRollerSpeed;
import edu.wpi.first.wpilibj.templates.commands.Unload;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;
    OI oi;
    Timer timer;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        //oi = new OI();
        autonomousCommand = new AutonCommandGroup();
        CommandBase.init();
        
        //SmartDashboard.putData(Scheduler.getInstance());
        
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        SmartDashboard.putData(autonomousCommand);
        autonomousCommand.start();
        
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
    }
            
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
        
        
     
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
        oi.rightBumperButton_driverControllerXbox.whenPressed(new Shoot(RobotMap.highShot));     //right bumper high shoot
        oi.leftBumperButton_driverControllerXbox.whenPressed(new Shoot(RobotMap.lowShot));      //left bumper low shoot
        oi.xButton_driverControllerXbox.whenPressed(new ToggleRollerSpeed());      //x button toggle roller speed 
        oi.aButton_driverControllerXbox.whenPressed(new Spitting());               //a button spit
        oi.yButton_driverControllerXbox.whenPressed(new Unload());                 //y button unloads
        oi.bButton_driverControllerXbox.whenPressed(new Reload());                 //b button reloads
        
        //mainDrive.tankDrive(oi.getJoystick(1, 0, 1), oi.getJoystick(1, 1, 1));
        //mainDrive.tankDrive(oi.driverControllerJoystick.getY(), oi.driverControllerJoystick.getY());      
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
