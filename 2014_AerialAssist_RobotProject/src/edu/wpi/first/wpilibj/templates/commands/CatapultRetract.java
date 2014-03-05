/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author e7admin
 */
public class CatapultRetract extends CommandBase {
    private double speed;
    public CatapultRetract(double theSpeed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(catapult);
        this.speed = theSpeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        catapult.ElevatorMotor1(-1 * speed);
        catapult.ElevatorMotor2(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return catapult.CatapultMSStart();
    }

    // Called once after isFinished returns true
    protected void end() {
        catapult.ElevatorMotor1(0);
        catapult.ElevatorMotor2(0);
        catapult.WaitAfterShooting();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}