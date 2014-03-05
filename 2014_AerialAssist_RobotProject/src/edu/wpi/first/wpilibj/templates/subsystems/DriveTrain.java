/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveWithXboxArcade;

/**
 *
 * @author chrislong1
 */
public class DriveTrain extends Subsystem {
        RobotDrive drive;
    // Initialize your subsystem here
    public DriveTrain() {
        drive = new RobotDrive(1, 2);
        
    }
    /**
     * Set the default command to drive with joysticks.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithXboxArcade());
    }

    public void setLeftRightMotorOutputs(double leftOutput, double rightOutput) 
    {
        drive.setLeftRightMotorOutputs(leftOutput, rightOutput);
    }
    
    public void tankDrive(double left, double right) {
        drive.tankDrive(left, right);
    }
    
    public void arcadeDrive(double left, double right, boolean squaredInputs) {
        drive.arcadeDrive(left, right, squaredInputs);
    }
     
    
}
