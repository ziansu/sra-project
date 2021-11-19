public de.d4k.tinkerforge.stromui.main.Ampel luefter() throws com.tinkerforge.NotConnectedException, com.tinkerforge.TimeoutException {
    industrialQuadRelay.setValue((1 | (industrialQuadRelay.getValue())));
    return this;
}