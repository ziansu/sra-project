@java.lang.Override
public final void autonomousPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    autonomousExecute();
    alwaysExecute();
}