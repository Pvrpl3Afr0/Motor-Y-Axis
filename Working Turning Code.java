package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "teleop", group = "hi")
public class MainRoboticsController extends LinearOpMode{

  @Override
  public void runOpMode() throws InterruptedException {
      final DcMotor rightFront = hardwareMap.dcMotor.get("rf");
      final DcMotor leftFront = hardwareMap.dcMotor.get("lf");
      final DcMotor rightBack = hardwareMap.dcMotor.get("rb");
      final DcMotor leftBack = hardwareMap.dcMotor.get("lb");
      waitForStart();
      while (opModeIsActive()) {
          rightBack.setPower(gamepad1.left_stick_y);
          leftBack.setPower(gamepad1.left_stick_y);
          rightFront.setPower(gamepad1.left_stick_y);
          leftFront.setPower(-gamepad1.left_stick_y);
          leftBack.setPower(gamepad1.right_stick_x);
          rightBack.setPower(-gamepad1.right_stick_x);
          leftFront.setPower(-gamepad1.right_stick_x);
          rightFront.setPower(-gamepad1.right_stick_x);
      }
    }
}