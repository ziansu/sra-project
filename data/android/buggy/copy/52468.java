private byte grant(byte operation, java.lang.Byte ac) {
    byte currentValue = (ac == null) ? ORole.PERMISSION_NONE : ac;
    currentValue |= ((byte) (operation));
    return currentValue;
}