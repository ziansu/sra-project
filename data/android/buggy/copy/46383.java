@java.lang.Override
public void startEmergencySMSService() {
    startService(new android.content.Intent(getBaseContext(), com.praxisgs.emergencysms.services.EmergencySMSService.class));
}