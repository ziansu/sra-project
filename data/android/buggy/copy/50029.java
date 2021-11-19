public static void printStatements() {
    java.lang.System.out.println(("Arm Pot = " + (Hardware.armPot.get())));
    java.lang.System.out.println(("LR distance = " + (Hardware.leftRearEncoder.getDistance())));
}