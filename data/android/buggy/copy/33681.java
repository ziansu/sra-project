public void setConfig(mekanism.api.transmitters.TransmissionType type, byte[] config) {
    sideConfigs.set(type.ordinal(), config);
}