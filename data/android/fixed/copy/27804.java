static void kill() {
    if ((rope1401.Simulator.process) != null) {
        rope1401.Simulator.process.destroy();
        java.lang.System.out.println("Simulator killed");
        rope1401.Simulator.isActive = false;
    }
}