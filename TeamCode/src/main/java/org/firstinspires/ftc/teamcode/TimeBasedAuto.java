package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.DriveTrain;
@Autonomous(name = "Auto", group = "Auto")
public class TimeBasedAuto extends LinearOpMode {
int step=0;
    @Override
    public void runOpMode() throws InterruptedException {
        DriveTrain driveTrain = new DriveTrain(hardwareMap);
        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            switch (step) {
                case 0:
                    if (driveTrain.forward(1.0)) {  // move forward 1 second, returns true when done
                        step++;
                    }
                    break;

                case 1:
                    if (driveTrain.rotate(1.0)) { // rotate left 1 second
                        step++;
                    }
                    break;

                case 2:
                    if (driveTrain.backward(1.0)) {
                        step++;
                    }
                    break;
            }

        }
    }
}
