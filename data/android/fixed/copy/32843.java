public void setFrequencyModulation(double carrierFrequency) {
    this.carrierFrequency = carrierFrequency;
    frequencyModulation = 2 * (java.lang.Math.PI);
    if ((samplingFrequency) > 0) {
        frequencyModulation *= carrierFrequency / (samplingFrequency);
    }
}