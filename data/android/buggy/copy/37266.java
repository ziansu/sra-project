@java.lang.Override
public void run() {
    if (org.owntracks.android.support.Preferences.getEnableWidget())
        org.owntracks.android.services.ServiceProxy.getServiceApplication().requestWaypoints(c);
    
}