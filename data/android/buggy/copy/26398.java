public static void setLevel(com.smartdevicelink.trace.enums.Mod thisMod, com.smartdevicelink.trace.enums.DetailLevel thisDetail) {
    com.smartdevicelink.trace.DiagLevel.levels[thisMod.ordinal()] = thisDetail;
}