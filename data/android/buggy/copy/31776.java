public static void log(java.lang.String msg) {
    java.lang.System.out.println(("(inceptus) Log Message:" + msg));
    edu.wpi.first.wpilibj.DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1, ("Log:" + msg));
    edu.wpi.first.wpilibj.DriverStationLCD.getInstance().updateLCD();
}