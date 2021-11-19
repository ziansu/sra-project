public static void setAllLevels(com.smartdevicelink.trace.enums.DetailLevel thisDetail) {
    for (int i = 0; i < (com.smartdevicelink.trace.DiagLevel.levels.length); i++) {
        com.smartdevicelink.trace.DiagLevel.levels[i] = thisDetail;
    }
}