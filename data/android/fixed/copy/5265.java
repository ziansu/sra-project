public static com.smartdevicelink.trace.enums.DetailLevel getLevel(com.smartdevicelink.trace.enums.Mod thisMod) {
    if (thisMod != null) {
        return com.smartdevicelink.trace.DiagLevel.levels[thisMod.ordinal()];
    }
    return null;
}