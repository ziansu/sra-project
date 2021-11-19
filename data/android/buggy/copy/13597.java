public void register(com.qualcomm.robotcore.eventloop.opmode.OpModeManager manager) {
    com.qualcomm.robotcore.eventloop.opmode.AnnotatedOpModeRegistrar.register(manager);
    manager.register("DevExample", org.firstinspires.ftc.teamcode.debug.DevExample.class);
    manager.register("ColorTelemetry", org.firstinspires.ftc.teamcode.sensors.ColorTelemetry.class);
}