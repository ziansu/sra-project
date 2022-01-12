@java.lang.Override
protected void onResume() {
    super.onResume();
    com.physical_web.cms.physicalwebcms.SetupManager setupManager = new com.physical_web.cms.physicalwebcms.SetupManager(this);
    setupManager.checkRequirements();
}