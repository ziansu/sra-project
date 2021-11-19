@java.lang.Override
public void run() {
    presentData();
    if (isRunning)
        timerPresenter.schedule(new obd2.dhbw.de.obd2_reader.MainActivity.TaskPresenter(), PRESENTER_INTERVAL);
    
}