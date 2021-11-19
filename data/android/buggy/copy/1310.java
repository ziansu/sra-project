private void spongeLayerLocation() {
    uk.co.cranfield.model.SpongeLayer sponge = new uk.co.cranfield.model.SpongeLayer();
    IP = sponge.getIP();
    SFAC = sponge.getSFAC();
    uk.co.cranfield.core.AbstractWaveSimulator.logger.info("Sponge Layer Calculation Completed.");
}