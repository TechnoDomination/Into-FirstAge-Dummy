package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.DriveTrain;
@TeleOp(name = "TeleOp", group = "TeleOp")
public class TankDriveTeleOp extends LinearOpMode {

    double frontLeftPower;
    double frontRightPower;
    double backLeftPower;
    double backRightPower;
    double forward;
    double strafe;
    double rotate;


    @Override
    public void runOpMode() throws InterruptedException {

        DriveTrain driveTrain = new DriveTrain(hardwareMap);
        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            forward = -gamepad1.left_stick_y;
            strafe = gamepad1.left_stick_x;
            rotate = gamepad1.right_stick_x;
            frontLeftPower = (forward + strafe + rotate);
            frontRightPower = (forward - strafe - rotate);
            backLeftPower = (forward - strafe + rotate);
            backRightPower = (forward + strafe - rotate);
            driveTrain.setPower(frontLeftPower, frontRightPower, backRightPower, backLeftPower);

        }

    }


}
