public static void main(java.lang.String[] args) {
    by.nc.shpakovskaya.console.HospitalConsole hospitalConsole = new by.nc.shpakovskaya.console.HospitalConsole();
    try {
        hospitalConsole.printMe();
    } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
}