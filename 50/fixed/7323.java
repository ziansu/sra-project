private static float readTemp(byte[] buf, int start) {
    return ((lohbihler.manfred.i2c.I2CReader.combine(buf, start)) / 340.0F) + 36.53F;
}