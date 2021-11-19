@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.openvehicles.OVMS.BaseApp.sInstance = this;
    com.testflightapp.lib.TestFlight.takeOff(this, "e34e1b78-366e-49b4-bd0f-ec704a76213e");
}