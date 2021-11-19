public void onActionCalculate() {
    java.lang.System.out.println("Page7 berechnen Button");
    outEvent();
    java.lang.System.out.println(root.getClspModel());
    root.calculateCLSP();
}