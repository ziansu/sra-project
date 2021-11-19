@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    this.attenuatedFlux = (1 - (sampleContainer.getContainerAttenuationFraction())) * (this.totalFlux);
}