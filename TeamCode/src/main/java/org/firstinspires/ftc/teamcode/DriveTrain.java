package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;


public class DriveTrain {

    public DcMotorEx FrontLeftDCMotor;
    public DcMotorEx FrontRightDCMotor;
    public DcMotorEx BackRightDCMotor;
    public DcMotorEx BackLeftDCMotor;
    public ElapsedTime timer;
    boolean resetTimer = false;

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

        public void stop() {
            FrontLeftDCMotor.setPower(0);
            FrontRightDCMotor.setPower(0);
            BackRightDCMotor.setPower(0);
            BackLeftDCMotor.setPower(0);
        }

        public boolean forward(double time){
        if (resetTimer == true) {
            timer.reset();
            FrontLeftDCMotor.setPower(0.8);
            FrontRightDCMotor.setPower(0.8);
            BackRightDCMotor.setPower(0.8);
            BackLeftDCMotor.setPower(0.8);
            resetTimer = false;
        }
        if (timer.seconds() > time) {
            stop();
            return true;
        }
        else {
            return false;
        }
    }
    public boolean backward(double time){
        if (resetTimer == true) {
            timer.reset();
            FrontLeftDCMotor.setPower(-0.8);
            FrontRightDCMotor.setPower(-0.8);
            BackRightDCMotor.setPower(-0.8);
            BackLeftDCMotor.setPower(-0.8);
            resetTimer = false;
        }
        if (timer.seconds() > time) {
            stop();
            return true;
        }
        else {
            return false;
        }
    }public boolean rotate(double time){
        if (resetTimer == true) {
            timer.reset();
            FrontLeftDCMotor.setPower(-0.8);
            FrontRightDCMotor.setPower(0.8);
            BackRightDCMotor.setPower(0.8);
            BackLeftDCMotor.setPower(-0.8);
            resetTimer = false;
        }
        if (timer.seconds() > time) {
            stop();
            return true;
        }
        else {
            return false;
        }
    }


}