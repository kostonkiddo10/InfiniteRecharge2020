package org.usfirst.frc3340.InfiniteRecharge.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3340.InfiniteRecharge.Robot;

public class DriveCommand extends Command {

    public DriveCommand(){
    requires(Robot.drive);
    }

    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.drive.robotDrive.arcadeDrive(Robot.oi.joystick.getY(), Robot.oi.joystick.getZ());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }


}