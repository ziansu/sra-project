public void setFrequencyModulation(double carrierFrequency) {
    this.carrierFrequency = carrierFrequency;
    frequencyModulation = (2 * (java.lang.Math.PI)) * (carrierFrequency / (samplingFrequency));
}