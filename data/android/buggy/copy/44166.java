private org.junit.platform.surefire.provider.TestPlanScannerFilter newFilter() {
    return new org.junit.platform.surefire.provider.TestPlanScannerFilter(org.junit.platform.launcher.core.LauncherFactory.create(), "", "");
}