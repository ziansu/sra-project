public static void forceFirstAppExecution() {
    com.marcohc.architecture.common.helper.PreferencesHelper.getInstance().putString(com.marcohc.architecture.common.helper.AppInfoHelper.IS_FIRST_APP_EXECUTION, "false");
}