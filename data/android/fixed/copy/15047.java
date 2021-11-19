@lc.api.jit.DeviceDrivers.DriverRTCallback(event = "computerEvent")
public void computerCraft_handleEvent(java.lang.String event, java.lang.Object... args) {
    computercraft_assertReady();
    synchronized(computercraft_icalist) {
        for (dan200.computercraft.api.peripheral.IComputerAccess azz : computercraft_icalist)
            azz.queueEvent(event, args);
        
    }
}