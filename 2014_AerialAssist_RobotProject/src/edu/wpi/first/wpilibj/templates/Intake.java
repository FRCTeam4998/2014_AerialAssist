/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;


/**
 *
 * @author e7admin
 */
public class Intake extends IterativeRobot {
    
    SpeedController intakeRoller = new Victor(3);
    
    public Intake() {
        intakeRoller.set(0.0);
    }

    public void toggle() {
        if (intakeRoller.get() != 0.0)
        {
            intakeRoller.set(0.0);
        }
        else
        {
            intakeRoller.set(0.5);
        }
    }
    
    public void spit() {
        if (intakeRoller.get() != -0.5)
        {
            intakeRoller.set(-0.5);
        }
        else
        {
            intakeRoller.set(0.0);
        }
    }
    
}