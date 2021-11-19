public byte[] getFirmwareFile() {
    if ((this.firmwareFile) == null) {
        return null;
    }
    return this.firmwareFile.clone();
}