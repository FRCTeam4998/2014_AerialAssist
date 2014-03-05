/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
/**
 *
 * @author e7admin
 */
public class Catapult extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    SpeedController elevMotor1 = new Victor(RobotMap.elevMotor);
    SpeedController elevMotor2 = new Victor(RobotMap.elevMotor2);  
    DigitalInput catMSStart = new DigitalInput(RobotMap.catMSStart);
    DigitalInput catMSEnd = new DigitalInput(RobotMap.catMSEnd);
    Timer timer;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void ElevatorMotor1(double speed) {
        elevMotor1.set(speed);
    }
    
    public void ElevatorMotor2(double speed) {
        elevMotor2.set(speed);
    }
    
    public boolean CatapultMSStart() {
        return catMSStart.get();
    }
    
    public boolean CatapultMSEnd() {
        return catMSEnd.get();
    }
    
    public void WaitAfterShooting() {
        
        timer.reset();
        timer.start();
        while(timer.get() < 2.0) {           
        }
        timer.stop();  
    }
    
    
}