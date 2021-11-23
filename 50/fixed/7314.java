public float byteToGigabyte(float num) {
    int divisor = 1000;
    return engine.DriveUtils.round((((num / divisor) / divisor) / divisor), 1);
}