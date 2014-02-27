
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DigitalInput;

public class Catapult extends IterativeRobot {

    SpeedController elevMotor = new Victor(1);
    SpeedController elevMotor2 = new Victor(2);  
    DigitalInput catMSStart = new DigitalInput(1);
    DigitalInput catMSEnd = new DigitalInput(2);
    Timer timer;
    

    public Catapult() {
        elevMotor.set(0.0);
        elevMotor2.set(0.0);
    }
    
    public void shoot(double speed) {
        if (checkSwitch(catMSStart))
        {
            while(!checkSwitch(catMSEnd)) {
                elevMotor.set(speed);
                elevMotor2.set(-1 * speed);
            }         
            
            waitAfterShooting();
            
            while(!checkSwitch(catMSStart)) {
                elevMotor.set(-1 * speed);
                elevMotor2.set(speed);
            }  
        }
    }
    public boolean checkSwitch(DigitalInput microSwitch) {
        
        return microSwitch.get();
    }
    
    public void waitAfterShooting() {
        
        timer.reset();
        timer.start();
        while(timer.get() < 2.0) {           
        }
        timer.stop();              
    }
}
