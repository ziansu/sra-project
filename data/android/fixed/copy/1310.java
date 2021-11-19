private void spongeLayerLocation() {
    uk.co.cranfield.model.SpongeLayer sponge = new uk.co.cranfield.model.SpongeLayer();
    this.IP = sponge.getIP();
    this.SFAC = sponge.getSFAC();
    uk.co.cranfield.core.AbstractWaveSimulator.logger.info("Sponge Layer Calculation Completed.");
}