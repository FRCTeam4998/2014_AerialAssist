/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author e7admin
 */
public class Intake extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    SpeedController intakeRollerL = new Victor(5);
    SpeedController intakeRollerR = new Victor(6);
    SpeedController winMotor = new Victor(7);
    //DigitalInput inMSStart = new DigitalInput(3);
    //DigitalInput inMSEnd = new DigitalInput(4);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    
    
    public void SetLeftIntakeRoller(double speed) {
        intakeRollerL.set(speed);
    }
    
    public void SetRightIntakeRoller(double speed) {
        intakeRollerR.set(speed);
    }
    
    public double GetLeftIntakeRoller() {
        return intakeRollerL.get();
    }
    
    public double GetRightIntakeRoller() {
        return intakeRollerR.get();
    }
    
    public void SetWindowMotor(double speed) {
        winMotor.set(speed);
    }
    
    public boolean IntakeMSStart() {
        return true; //inMSStart.get();
    }
    
    public boolean IntakeMSEnd() {
        return true; //inMSEnd.get();
    }
}