/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;


/**
 *
 * @author e7admin
 */
public class Intake extends IterativeRobot {
    
    SpeedController intakeRollerL = new Victor(3);
    SpeedController intakeRollerR = new Victor(4);
    SpeedController winMotor = new Victor(5);
    DigitalInput inMSStart = new DigitalInput(3);
    DigitalInput inMSEnd = new DigitalInput(4);
    
    public Intake() {
        intakeRollerL.set(0.0);
        intakeRollerR.set(0.0);
    }

    public void toggleRollerSpeed() {
        if ((intakeRollerL.get() != 0.0) || (intakeRollerR.get() != 0.0))
        {
            intakeRollerL.set(0.0);
            intakeRollerR.set(0.0);
        }
        else
        {
            intakeRollerL.set(0.5);
            intakeRollerR.set(-0.5);
        }
    }
    
    public void spit() {
        if ((intakeRollerL.get() != -0.5)  || (intakeRollerR.get() != 0.5))
        {
            intakeRollerL.set(-0.5);
            intakeRollerR.set(0.5);
        }
        else
        {
            intakeRollerL.set(0.0);
            intakeRollerR.set(0.0);
        }
    }
    
    public void unload() {
        double speed = 0.5;
        
        if (checkSwitch(inMSStart))
        {
            while(!checkSwitch(inMSEnd)) {
                winMotor.set(speed);
            }         
        }   
    }
    
    public void reload() {
        double speed = -0.5;
        
        if (checkSwitch(inMSEnd))
        {
            while(!checkSwitch(inMSStart)) {
                winMotor.set(speed);
            }         
        }   
    }
    
    public void toggleLoad() {
        if (checkSwitch(inMSEnd))
            reload();
        else
            unload();
    }
    
    public boolean checkSwitch(DigitalInput microSwitch) {    
        return microSwitch.get();
    }
}