private static float readTemp(byte[] buf) {
    return ((lohbihler.manfred.i2c.I2CReader.combine(buf, lohbihler.manfred.i2c.I2CReader.TEMP_OUT_H_OFF)) / 340.0F) + 36.53F;
}