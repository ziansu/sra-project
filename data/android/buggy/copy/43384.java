@java.lang.Override
public void run() {
    LogitechController.UpdateControllerComponents();
    contentPane.Refresh();
    UpdateArduino();
    for (int i = 0; i < 16; i++) {
        LogitechController.setUpdated(i, false);
    }
}