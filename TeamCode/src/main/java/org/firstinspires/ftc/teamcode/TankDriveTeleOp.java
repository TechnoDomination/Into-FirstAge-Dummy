package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.DriveTrain;
public class TankDriveTeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        DriveTrain driveTrain = new DriveTrain(hardwareMap);
        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {

        }

    }


}
