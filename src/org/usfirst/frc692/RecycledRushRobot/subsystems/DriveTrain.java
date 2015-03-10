// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc692.RecycledRushRobot.subsystems;

import org.usfirst.frc692.RecycledRushRobot.RobotMap;
import org.usfirst.frc692.RecycledRushRobot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; 
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftFrontTalon0 = RobotMap.driveTrainleftFrontTalon0;
    SpeedController leftBackTalon1 = RobotMap.driveTrainleftBackTalon1;
    SpeedController rightFrontTalon2 = RobotMap.driveTrainrightFrontTalon2;
    SpeedController rightBackTalon3 = RobotMap.driveTrainrightBackTalon3;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    Gyro gyro = RobotMap.driveTraingyro;
    Encoder leftFrontEncoder = RobotMap.driveTrainleftFrontEncoder;
    Encoder leftBackEncoder = RobotMap.driveTrainleftBackEncoder;
    Encoder rightFrontEncoder = RobotMap.driveTrainrightFrontEncoder;
    Encoder rightBackEncoder = RobotMap.driveTrainrightBackEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithoutGyro());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveForward() {
    	robotDrive.mecanumDrive_Cartesian(0.0, 0.3, 0.0, 0.0);
    }
    
    public void moveBackward() {
    	robotDrive.mecanumDrive_Cartesian(0.0, -0.3, 0.0, 0.0);
    }
    
    public void moveLeft() {
    	robotDrive.mecanumDrive_Cartesian(-1.0, 0.0, 0.0, 0.0);
    }
    
    public void moveRight() {
    	robotDrive.mecanumDrive_Cartesian(1.0, 0.0, 0.0, 0.0);
    }
    
    public void stopDrive() {
    	robotDrive.mecanumDrive_Cartesian(0.0, 0.0, 0.0, 0.0);
    }
    
    public void takeJoystickValueGyro(double xaxis, double yaxis, double rotate, double gyro) { 
    	robotDrive.mecanumDrive_Cartesian(xaxis, yaxis, rotate, gyro);
    }
    // made a constructor to get values of joystick to drive in one direction WITH GYRO
    // EV 1/15/2015
    
    public void resetEncoders() {
    	leftFrontEncoder.reset();
    	leftBackEncoder.reset();
    	rightFrontEncoder.reset();
    	rightBackEncoder.reset();
    }
    
    public int getLeftFrontEncoderCount() {
    	return leftFrontEncoder.get();
    }
    // gets count from left front encoder
    // AO 1/17/15
    
    public int getLeftBackEncoderCount() {
    	return leftBackEncoder.get();	
    }
    // gets count from left back encoder
    // AO /17/15
    
    public int getRightFrontEncoderCount() {
    	return rightFrontEncoder.get();
    }
    // gets count from right front encoder
    // AO 1/17/15
    
    public int getRightBackEncoderCount() {
    	return rightBackEncoder.get();
    }
    // get count from right back encoder
    // AO 1/17/15
    
    public boolean getLeftFrontEncoderDirection() {
    	if (leftFrontEncoder.getDirection() == true)
    		return true;
    	else
    		return false;
    }
    // get the direction of the last value change (true for Up, false for Down)
    // EV 1/17/2015
    
    public boolean getLeftBackEncoderDirection() {
    	if (leftBackEncoder.getDirection() == true)
    		return true;
    	else
    		return false;
    }
    // get the direction of the last value change (true for Up, false for Down)
    // EV 1/17/2015
    
    public boolean getRightFrontEncoderDirection () {
    	if (rightFrontEncoder.getDirection() == true)
    		return true;
    	else
    		return false;
    }
    // get the direction of the last value change (true for Up, false for Down)
    // EV 1/17/2015
    
    public boolean getRightBackEncoderDirection() {
    	if (rightBackEncoder.getDirection() == true)
    		return true;
    	else
    		return false;
    }
    // get the direction of the last value change (true for Up, false for Down)
    // EV 1/17/2015
    
    public double getLeftFrontEncoderDistance() {
    	return leftFrontEncoder.getDistance();
    }
    // gets the current distance reading from the counter
    // this is the count multiplied by the Distance Per Count scale factor
    // ND 1/17/15
    
    public double getLeftBackEncoderDistance() {
    	return leftBackEncoder.getDistance();
    }
    // gets the current distance reading from the counter
    // this is the count multiplied by the Distance Per Count scale factor
    // ND 1/17/15
	
    public double getRightFrontEncoderDistance() {
    	return rightFrontEncoder.getDistance();
    }
    // gets the current distance reading from the counter
    // this is the count multiplied by the Distance Per Count scale factor
    // ND 1/17/15
    
    public double getRightBackEncoderDistance() {
    	return rightBackEncoder.getDistance();
    }
    // gets the current distance reading from the counter
    // this is the count multiplied by the Distance Per Count scale factor
    // ND 1/17/15
    
    public double getAllLeftAndRightEncodersDistance() {
    	return getLeftFrontEncoderDistance() + getLeftBackEncoderDistance() + getRightFrontEncoderDistance() + getRightBackEncoderDistance();
    }
    // taking all of the values of all of the encoders
    // AO 1/17/15
    
    public double getLeftFrontEncoderRate() {
    	return leftFrontEncoder.getRate();
    }
    // gets the current rate of the counter in units/sec
    // it is calculated using the DistancePerPulse divided by the period
    // if the counter is stopped this value may return Inf or NaN, depending on language
    // AO 1/17/15
    
    public double getLeftBackEncoderRate() {
    	return leftBackEncoder.getRate();
    }
    // gets the current rate of the counter in units/sec
    // it is calculated using the DistancePerPulse divided by the period
    // if the counter is stopped this value may return Inf or NaN, depending on language
    // AO 1/17/15
    
    public double getRightFrontEncoderRate() {
    	return rightFrontEncoder.getRate();
    }
    // gets the current rate of the counter in units/sec
    // it is calculated using the DistancePerPulse divided by the period
    // if the counter is stopped this value may return Inf or NaN, depending on language
    // AO 1/17/15
    
    public double getRightBackEncoderRate() {
    	return rightBackEncoder.getRate();
    }
    // gets the current rate of the counter in units/sec
    // it is calculated using the DistancePerPulse divided by the period
    // if the counter is stopped this value may return Inf or NaN, depending on language
    // AO 1/17/15
    
    public boolean allEncodersStopCounting() {
    	if (leftFrontEncoder.getStopped() && leftBackEncoder.getStopped() && rightFrontEncoder.getStopped() && rightBackEncoder.getStopped() == true)
    		return true; 
    	else 
    		return false; 
    }
    // checks if all encoders have stopped counting (because conditional statement)
    // AO 1/17/15 
    
    public double getLeftFrontEncoderRaw() {
    	return leftFrontEncoder.getRaw();
    }
    // gets the count without compensation for decoding scale factor
    // EV 1/17/2015

    
    public double getLeftBackEncoderRaw() {
    	return leftBackEncoder.getRaw();
    }
    // gets the count without compensation for decoding scale factor
    // EV 1/17/2015
    
    public double getRightFrontEncoderRaw() {
    	return rightFrontEncoder.getRaw();
    }
    // gets the count without compensation for decoding scale factor
    // EV 1/17/2015
    
    public double getRightBackEncoderRaw() {
    	return rightBackEncoder.getRaw();
    }
    // gets the count without compensation for decoding scale factor
    // EV 1/17/2015
  
}

