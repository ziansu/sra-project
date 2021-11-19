public void setMagODR(int mRate) {
    MagSettings.CTRL_REG1_MVal &= 255 ^ (7 << 2);
    MagSettings.CTRL_REG1_MVal |= (mRate & 7) << 2;
    MagSettings.sampleRate = mRate & 7;
    mWriteByte(com.ociweb.iot.astropi.CTRL_REG1_M, MagSettings.CTRL_REG1_MVal);
    target.i2cFlushBatch();
}