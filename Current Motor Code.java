package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by admin on 11/29/16.
 */
@TeleOp(name = "teleop", group = "hi")
public class cs extends LinearOpMode{
    DcMotor rightFront;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor leftBack;

    @Override
    public void runOpMode() throws InterruptedException {
        rightFront = hardwareMap.dcMotor.get("rf");
        leftFront = hardwareMap.dcMotor.get("lf");
        rightBack = hardwareMap.dcMotor.get("rb");
        leftBack = hardwareMap.dcMotor.get("lb");

        waitForStart();

        while (opModeIsActive()) {
            rightBack.setPower(gamepad1.left_stick_y);
            leftBack.setPower(-gamepad1.left_stick_y);
            rightFront.setPower(gamepad1.left_stick_y);
            leftFront.setPower(-gamepad1.left_stick_y);

            leftBack.setPower(gamepad1.right_stick_x);
            rightBack.setPower(gamepad1.right_stick_x);

            leftBack.setPower(-gamepad1.right_stick_x);
            rightback.setPower(-gamepad1.right_stick_x);

            

        }

    }
}