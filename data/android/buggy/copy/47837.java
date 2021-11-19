@java.lang.Override
public void applyContainerAttenuation(se.raddo.raddose3D.Container sampleContainer) {
    this.attenuatedFlux = (sampleContainer.getContainerAttenuationFraction()) * (this.totalFlux);
}