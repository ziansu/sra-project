@java.lang.Override
public com.parrot.freeflight.drone.NavData getDroneNavData() {
    com.parrot.freeflight.drone.NavData navdata = null;
    synchronized(navDataLock) {
        navdata = droneProxy.getNavdata();
    }
    return navdata;
}