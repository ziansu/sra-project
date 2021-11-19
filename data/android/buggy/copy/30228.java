public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    manager.register("Auto Blue 1", com.qualcomm.ftcrobotcontroller.opmodes.us.gotrobot.lois.autonomous.programs.AutoBlue.class);
    manager.register("TeleOp", com.qualcomm.ftcrobotcontroller.opmodes.us.gotrobot.lois.teleop.TeleOp.class);
}