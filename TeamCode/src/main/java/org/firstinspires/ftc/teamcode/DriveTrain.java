package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class DriveTrain {

    public DcMotorEx FrontLeftDCMotor;
    public DcMotorEx FrontRightDCMotor;
    public DcMotorEx BackRightDCMotor;
    public DcMotorEx BackLeftDCMotor;

    public DriveTrain(HardwareMap hardwareMap) {

        FrontLeftDCMotor = hardwareMap.get(DcMotorEx.class, "FrontLeftDCMotor");
        FrontRightDCMotor = hardwareMap.get(DcMotorEx.class, "FrontRightDCMotor");
        BackLeftDCMotor = hardwareMap.get(DcMotorEx.class, "BackLeftDCMotor");
        BackRightDCMotor = hardwareMap.get(DcMotorEx.class, "BackRightDCMotor");

        FrontLeftDCMotor.setDirection(DcMotor.Direction.REVERSE);
        FrontRightDCMotor.setDirection(DcMotor.Direction.FORWARD);
        BackLeftDCMotor.setDirection(DcMotor.Direction.REVERSE);
        BackRightDCMotor.setDirection(DcMotor.Direction.FORWARD);

    }

        public void setPower(double leftBack, double leftFront, double rightBack, double rightFront) {

            FrontLeftDCMotor.setPower(leftFront);
            FrontRightDCMotor.setPower(rightFront);
            BackRightDCMotor.setPower(rightBack);
            BackLeftDCMotor.setPower(leftBack);
        }


}