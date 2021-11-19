@java.lang.Override
public void run() {
    Settings.Secure.putString(getContentResolver(), "screensaver_components", (((getApplicationInfo().packageName) + "/") + (com.komok.dreamapprunner.DreamAppRunnerService.class.getName())));
}