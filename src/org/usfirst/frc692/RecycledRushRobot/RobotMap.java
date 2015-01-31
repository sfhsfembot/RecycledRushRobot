// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.RecycledRushRobot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController caterpillarcaterpillarBelt;
    public static DigitalInput toteAlignmentsuctionCupAlignmentLimit;
    public static DoubleSolenoid gatherergathererInOutPiston;
    public static DoubleSolenoid gatherergathererUpDownPiston;
    public static DigitalInput gatherergathererDeployedLimit;
    public static DigitalInput gatherergathererToteDetectionLimit;
    public static DigitalInput gatherergathererRetractedLimit;
    public static DigitalInput elevatorelevatorLevelTopLoadLimit;
    public static DigitalInput elevatorelevatorLevelStepLimit;
    public static DigitalInput elevatorelevatorLevelGroundLimit;
    public static DoubleSolenoid elevatorflapperRelease;
    public static DoubleSolenoid elevatorbackstopRelease;
    public static SpeedController elevatorelevatorPlatformUpDownMotor;
    public static Compressor pneumaticscompressorOne;
    public static SpeedController rollyGrabberrollyGrabberMotorOne;
    public static SpeedController rollyGrabberrollyGrabberMotorTwo;
    public static DigitalInput recycleBinClawrecycleBinDropLimit;
    public static Encoder recycleBinClawrecycleBinClawEncoder;
    public static DoubleSolenoid recycleBinClawrecycleBinClawOpenCloser;
    public static SpeedController recycleBinClawrecycleBinWinchMotor;
    public static SpeedController driveTrainleftFrontTalon0;
    public static SpeedController driveTrainleftBackTalon1;
    public static SpeedController driveTrainrightFrontTalon2;
    public static SpeedController driveTrainrightBackTalon3;
    public static RobotDrive driveTrainRobotDrive;
    public static Gyro driveTraingyro;
    public static Encoder driveTrainleftFrontEncoder;
    public static Encoder driveTrainleftBackEncoder;
    public static Encoder driveTrainrightFrontEncoder;
    public static Encoder driveTrainrightBackEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        caterpillarcaterpillarBelt = new Talon(5);
        LiveWindow.addActuator("Caterpillar", "caterpillarBelt", (Talon) caterpillarcaterpillarBelt);
        
        toteAlignmentsuctionCupAlignmentLimit = new DigitalInput(14);
        LiveWindow.addSensor("ToteAlignment", "suctionCupAlignmentLimit", toteAlignmentsuctionCupAlignmentLimit);
        
        gatherergathererInOutPiston = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("Gatherer", "gathererInOutPiston", gatherergathererInOutPiston);
        
        gatherergathererUpDownPiston = new DoubleSolenoid(0, 2, 3);      
        LiveWindow.addActuator("Gatherer", "gathererUpDownPiston", gatherergathererUpDownPiston);
        
        gatherergathererDeployedLimit = new DigitalInput(5);
        LiveWindow.addSensor("Gatherer", "gathererDeployedLimit", gatherergathererDeployedLimit);
        
        gatherergathererToteDetectionLimit = new DigitalInput(7);
        LiveWindow.addSensor("Gatherer", "gathererToteDetectionLimit", gatherergathererToteDetectionLimit);
        
        gatherergathererRetractedLimit = new DigitalInput(6);
        LiveWindow.addSensor("Gatherer", "gathererRetractedLimit", gatherergathererRetractedLimit);
        
        elevatorelevatorLevelTopLoadLimit = new DigitalInput(2);
        LiveWindow.addSensor("Elevator", "elevatorLevelTopLoadLimit", elevatorelevatorLevelTopLoadLimit);
        
        elevatorelevatorLevelStepLimit = new DigitalInput(1);
        LiveWindow.addSensor("Elevator", "elevatorLevelStepLimit", elevatorelevatorLevelStepLimit);
        
        elevatorelevatorLevelGroundLimit = new DigitalInput(0);
        LiveWindow.addSensor("Elevator", "elevatorLevelGroundLimit", elevatorelevatorLevelGroundLimit);
        
        elevatorflapperRelease = new DoubleSolenoid(0, 4, 5);      
        LiveWindow.addActuator("Elevator", "flapperRelease", elevatorflapperRelease);
        
        elevatorbackstopRelease = new DoubleSolenoid(0, 6, 7);      
        LiveWindow.addActuator("Elevator", "backstopRelease", elevatorbackstopRelease);
        
        elevatorelevatorPlatformUpDownMotor = new Talon(4);
        LiveWindow.addActuator("Elevator", "elevatorPlatformUpDownMotor", (Talon) elevatorelevatorPlatformUpDownMotor);
        
        pneumaticscompressorOne = new Compressor(0);
        
        
        rollyGrabberrollyGrabberMotorOne = new Talon(8);
        LiveWindow.addActuator("RollyGrabber", "rollyGrabberMotorOne", (Talon) rollyGrabberrollyGrabberMotorOne);
        
        rollyGrabberrollyGrabberMotorTwo = new Talon(9);
        LiveWindow.addActuator("RollyGrabber", "rollyGrabberMotorTwo", (Talon) rollyGrabberrollyGrabberMotorTwo);
        
        recycleBinClawrecycleBinDropLimit = new DigitalInput(15);
        LiveWindow.addSensor("RecycleBinClaw", "recycleBinDropLimit", recycleBinClawrecycleBinDropLimit);
        
        recycleBinClawrecycleBinClawEncoder = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor("RecycleBinClaw", "recycleBinClawEncoder", recycleBinClawrecycleBinClawEncoder);
        recycleBinClawrecycleBinClawEncoder.setDistancePerPulse(1.0);
        recycleBinClawrecycleBinClawEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        recycleBinClawrecycleBinClawOpenCloser = new DoubleSolenoid(1, 0, 1);      
        LiveWindow.addActuator("RecycleBinClaw", "recycleBinClawOpenCloser", recycleBinClawrecycleBinClawOpenCloser);
        
        recycleBinClawrecycleBinWinchMotor = new Talon(6);
        LiveWindow.addActuator("RecycleBinClaw", "recycleBinWinchMotor", (Talon) recycleBinClawrecycleBinWinchMotor);
        
        driveTrainleftFrontTalon0 = new VictorSP(0);
        LiveWindow.addActuator("DriveTrain", "leftFrontTalon0", (VictorSP) driveTrainleftFrontTalon0);
        
        driveTrainleftBackTalon1 = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "leftBackTalon1", (VictorSP) driveTrainleftBackTalon1);
        
        driveTrainrightFrontTalon2 = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "rightFrontTalon2", (VictorSP) driveTrainrightFrontTalon2);
        
        driveTrainrightBackTalon3 = new VictorSP(3);
        LiveWindow.addActuator("DriveTrain", "rightBackTalon3", (VictorSP) driveTrainrightBackTalon3);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainleftFrontTalon0, driveTrainleftBackTalon1,
              driveTrainrightFrontTalon2, driveTrainrightBackTalon3);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTraingyro = new Gyro(0);
        LiveWindow.addSensor("DriveTrain", "gyro", driveTraingyro);
        driveTraingyro.setSensitivity(0.007);
        driveTrainleftFrontEncoder = new Encoder(17, 18, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "leftFrontEncoder", driveTrainleftFrontEncoder);
        driveTrainleftFrontEncoder.setDistancePerPulse(1.0);
        driveTrainleftFrontEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainleftBackEncoder = new Encoder(12, 13, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "leftBackEncoder", driveTrainleftBackEncoder);
        driveTrainleftBackEncoder.setDistancePerPulse(1.0);
        driveTrainleftBackEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainrightFrontEncoder = new Encoder(10, 11, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "rightFrontEncoder", driveTrainrightFrontEncoder);
        driveTrainrightFrontEncoder.setDistancePerPulse(1.0);
        driveTrainrightFrontEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainrightBackEncoder = new Encoder(9, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "rightBackEncoder", driveTrainrightBackEncoder);
        driveTrainrightBackEncoder.setDistancePerPulse(1.0);
        driveTrainrightBackEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
