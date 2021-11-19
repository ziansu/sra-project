private void updateAllSteps() {
    for (org.smcnus.irace_gaittester.Models.SensorInstance accel : accels) {
        updateStep(accel);
    }
    accels.clear();
}