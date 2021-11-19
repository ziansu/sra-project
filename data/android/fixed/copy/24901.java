public static boolean isFirstUseLast24Hours() {
    long lastUseTime = com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().getLong(com.marcohc.architecture.common.helper.AppInfoHelper.LAST_APP_EXECUTION, (-1L));
    return (lastUseTime == (-1)) || (!(com.marcohc.architecture.common.helper.DateHelper.isInTheLast24HoursOfCurrentDate(lastUseTime)));
}