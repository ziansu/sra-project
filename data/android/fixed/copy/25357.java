public static edu.ncku.uscc.util.PanelTimerScheduler getInstance(edu.ncku.uscc.io.DehumidRoomController controller) {
    if ((edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler) == null) {
        edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler = new edu.ncku.uscc.util.PanelTimerScheduler(controller);
    }
    return edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler;
}