public static boolean writeInteger(final java.lang.String filePath, final int value) {
    return ev3dev.utils.Sysfs.writeString(filePath, new java.lang.StringBuilder().append(value).toString());
}