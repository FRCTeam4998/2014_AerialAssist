package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    // Create the joystick and of the 8 buttons on it
    Joystick driverControllerXbox = new Joystick(1);
        Button xButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 1),
                yButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 2),
                bButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 3),
                aButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 4),
                startButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 5),
                backButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 6),
                leftBumperButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 7),
                rightBumperButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 8),
                leftJoystickButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 9),
                rightJoystickButton_driverControllerXbox = new JoystickButton(driverControllerXbox, 8);
  
    Joystick operatorControllerXbox = new Joystick(2);
        Button xButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 1),
                yButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 2),
                bButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 3),
                aButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 4),
                startButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 5),
                backButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 6),
                leftBumperButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 7),
                rightBumperButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 8),
                leftJoystickButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 9),
                rightJoystickButton_operatorControllerXbox = new JoystickButton(operatorControllerXbox, 8);
    
    Joystick driverControllerJoystick = new Joystick(1);
        Button triggerButton_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 1),
                thumbButtonNum_2_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 2),
                thumbButtonNum_3_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 3),
                thumbButtonNum_4_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 4),
                thumbButtonNum_5_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 5),
                thumbButtonNum_6_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 6),
                baseButtonNum_7_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 7),
                baseButtonNum_8_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 8),
                baseButtonNum_9_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 9),
                baseButtonNum_10_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 10),
                baseButtonNum_11_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 11),
                baseButtonNum_12_driverControllerJoystick = new JoystickButton(driverControllerJoystick, 12);

    Joystick operatorControllerJoystick = new Joystick(2);
        Button triggerButton_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 1),
                thumbButtonNum_2_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 2),
                thumbButtonNum_3_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 3),
                thumbButtonNum_4_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 4),
                thumbButtonNum_5_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 5),
                thumbButtonNum_6_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 6),
                baseButtonNum_7_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 7),
                baseButtonNum_8_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 8),
                baseButtonNum_9_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 9),
                baseButtonNum_10_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 10),
                baseButtonNum_11_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 11),
                baseButtonNum_12_operatorControllerJoystick = new JoystickButton(operatorControllerJoystick, 12);     
    /**
     * Bind the press of each button to a specific command or command group.
     * @param controller - Driver or Operator
     * @param side - Left or Right
     * @return zero if no cases meet requirements 
     */
    public double getTrigger(int controller, int side)
    {
        switch (controller) 
        {
           case 1:
               if(side == 0)
               {
                    if(driverControllerXbox.getRawAxis(3) < 0)
                    { 
                        return driverControllerXbox.getRawAxis(3);
                    }
               }
               if(side == 1)
               {
                    if(driverControllerXbox.getRawAxis(3) > 0)
                    { 
                        return driverControllerXbox.getRawAxis(3);
                    }
               }
               break;
           case 2:
               if(side == 0)
               {
                    if(operatorControllerXbox.getRawAxis(3) < 0)
                    { 
                        return operatorControllerXbox.getRawAxis(3);
                    }  
               }
               if(side == 1)
               {
                    if(operatorControllerXbox.getRawAxis(3) > 0)
                    { 
                        return operatorControllerXbox.getRawAxis(3);
                    }    
               }
               break;
           default:
               break;
                   
        }   
        return 0;
    }
    
    public double getJoystick(int controller, int side, int axis)
    {
        switch (controller)
        {
            case 1: // Driver Controller
                if(side == 0)   // Left side
                {
                    if(axis == 0)   // X Axis
                    {
                        return driverControllerXbox.getRawAxis(1);
                    }
                    if(axis == 1) // Y Axis
                    {
                        return driverControllerXbox.getRawAxis(2);                 
                    }
                }
                if(side == 1)   // Right Side
                {
                    if(axis == 0)   // X Axis
                    {
                        return driverControllerXbox.getRawAxis(4);
                    }
                    if(axis == 1) // Y Axis
                    {
                        return driverControllerXbox.getRawAxis(5);                 
                    }
                }
                break;
            case 2: // Operator Controller
                if(side == 0)   // Left side
                {
                    if(axis == 0)   // X Axis
                    {
                        return operatorControllerXbox.getRawAxis(1);
                    }
                    if(axis == 1) // Y Axis
                    {
                        return operatorControllerXbox.getRawAxis(2);                 
                    }
                }
                if(side == 1)   // Right Side
                {
                    if(axis == 0)   // X Axis
                    {
                        return operatorControllerXbox.getRawAxis(4);
                    }
                    if(axis == 1) // Y Axis
                    {
                        return operatorControllerXbox.getRawAxis(5);                 
                    }
                }
                
                
                
                break;
            default:
               break;            
        }
        return 0;
        
    }
}

