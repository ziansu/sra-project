public static boolean isAppearanceExternalFile(java.lang.String appearance) {
    if ((appearance != null) && (appearance.toLowerCase().trim().startsWith("search("))) {
        return true;
    }else {
        return false;
    }
}