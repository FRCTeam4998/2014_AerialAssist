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
public class ToggleRollerSpeed extends CommandBase {
    double leftIntakeRoller, rightIntakeRoller;
    public ToggleRollerSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        leftIntakeRoller = intake.GetLeftIntakeRoller();
        rightIntakeRoller = intake.GetRightIntakeRoller();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if ((leftIntakeRoller == 0.0) && (rightIntakeRoller == 0.0))
        {
            intake.SetLeftIntakeRoller(RobotMap.intakeSpeed);
            intake.SetRightIntakeRoller(RobotMap.intakeSpeed * -1);
        }
        else
        {
            intake.SetLeftIntakeRoller(0.0);
            intake.SetRightIntakeRoller(0.0);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}