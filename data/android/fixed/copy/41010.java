public boolean importConfig(org.catrobat.jira.adminhelper.helper.JsonConfig config) {
    java.lang.System.out.println("importing config");
    try {
        org.catrobat.jira.adminhelper.helper.HelperUtil.saveConfig(config, configService);
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}