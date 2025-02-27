package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.CANMotor;
import edu.wpi.first.wpilibj2.AbsoluteEncoder;
import edu.wpi.first.wpilibj2.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber{
    CANMotor climb_kracken;
    AbsoluteEncoder climb_encoder;
    Solenoid climb_solenoid_1, climb_solenoid_2;

    double climbRate = 1.0;
            totalTime = 0;
            avgTime = 0;
            vibration = 0;
    double[] time;
    int timer = 0;
            i = 0;
        
    public enum ClimbState{
        STOP,
        CLIMB,
        FORCE_CLIMB
    }
    public climber(){
        climb_kracken = new Kracken;
        time = new double[] {0,0,0,0,0};
    }
    public void climb(int climbButton, int forceClimbButton) {
        boolean climb = robot.xbox("ClimbButton",true);
                forceClimb = robot.xbox.heldDown(forceClimbButton);
                
                
                avgCurrent();

                if (forceClimb) {
                    climbStatus = ClimbState.FORCE_CLIMB;
                } else if (climb) {
                    climbStatus = ClimbState.CLIMB;
                } else {
                    climbStatus = ClimbState.STOP;
                }
            }
        if (avgTime < 40){
            climb_kracken.set(climbRate);
        } else {
            climbStatus = ClimbStatus.STOP;
        }
        break;
case FORCE_CLIMB:
    climb_kracken.set(climbRate);
    break;
    
    }
}