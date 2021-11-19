public static edu.ncku.uscc.util.PanelTimerScheduler getInstance(edu.ncku.uscc.io.DehumidRoomController controller) {
    if ((edu.ncku.uscc.util.PanelTimerScheduler.controllerRef) == null) {
        edu.ncku.uscc.util.PanelTimerScheduler.controllerRef = controller;
    }
    if ((edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler) == null) {
        edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler = new edu.ncku.uscc.util.PanelTimerScheduler();
    }
    return edu.ncku.uscc.util.PanelTimerScheduler.panelTimerScheduler;
}