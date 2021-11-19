public static boolean isCodeSystemAvailable(java.lang.String codeSystem) {
    boolean result = false;
    if (codeSystem != null) {
        result = ((ApplicationConstants.CODE_SYSTEM_MAP.get(codeSystem)) == null) ? false : true;
    }
    return result;
}