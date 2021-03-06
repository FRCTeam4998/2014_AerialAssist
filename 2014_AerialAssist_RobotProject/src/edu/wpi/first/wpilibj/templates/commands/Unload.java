/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author e7admin
 */
public class Unload extends CommandBase {
    
    
    public Unload() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        intake.SetWindowMotor(RobotMap.unloadSpeed);    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return intake.IntakeMSEnd();
    }

    // Called once after isFinished returns true
    protected void end() {
        intake.SetWindowMotor(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}