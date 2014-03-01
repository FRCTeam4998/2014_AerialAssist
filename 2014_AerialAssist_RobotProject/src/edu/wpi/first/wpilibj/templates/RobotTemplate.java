/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;
    Catapult catapult;
    OI oi;
    Intake intake;
    Timer timer;
    RobotDrive mainDrive = new RobotDrive(1,2,3,4);

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        catapult = new Catapult();
        intake = new Intake();
        oi = new OI();

        // Initialize all subsystems
        CommandBase.init();
        SmartDashboard.putData(Scheduler.getInstance());
        
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousCommand.start();
        
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
        if (isGoalHot())
        {
            moveForward(2);
            catapult.shoot(0.5);
            moveForward(3);
        }
        else
        {
            moveForward(5);
            catapult.shoot(0.4);            
        }
    }
    
    public void moveForward(int time) {
        timer = new Timer();
        
        timer.start();
            while(timer.get() < 3)
            {
                mainDrive.tankDrive(0.5, 0.5);
            }
            timer.stop();
        
    }
    
    public boolean isGoalHot() {
        
        return true;
    }
            

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
        
        intake.unload();
     
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
        mainDrive.tankDrive(oi.getJoystick(1, 0, 1), oi.getJoystick(1, 1, 1));
        
        if (oi.getTrigger(1, 1) == 1)
        {
            catapult.shoot(0.7);    //Shoot with right trigger
        }
        
        if (oi.getTrigger(1, 0) == 1)
        {
            catapult.shoot(0.3);    //Slow shoot with left trigger
        }
        
        if (oi.aButton_driverControllerXbox.get())
        {
            intake.toggleRollerSpeed();    //toggle roller on and off with a
        }
        
        if (oi.bButton_driverControllerXbox.get())
        {
            intake.spit();    //spit out ball from roller with b
        }
        
        if (oi.yButton_driverControllerXbox.get())
        {
            intake.toggleLoad();    //toggle the unload/reload position of the rollers with y
        }        
                
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
