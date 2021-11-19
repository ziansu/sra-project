public double getFirstGearPercentage(int whichJoystick) {
    if (((whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.ONE_JOYSTICK)) || (whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.RIGHT_JOYSTICK))) || (whichJoystick == (org.usfirst.frc.team339.HardwareInterfaces.transmission.Transmission_old.WhichJoystick.ONE_JOYSTICK)))
        return this.getFirstGearPercentage();
    else
        return this.leftFirstGearPercentage;
    
}