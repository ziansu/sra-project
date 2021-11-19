public void frTest() {
    fr = 37000;
    if (ir.hasIrEmitter()) {
        android.hardware.ConsumerIrManager[] freqs = ir.getCarrierFrequencies();
        for (android.hardware.ConsumerIrManager.CarrierFrequencyRange range : freqs) {
            fr = range.getMaxFrequency();
        }
    }
}