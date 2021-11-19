@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.EE5.image_manipulation.PatternDetector patternDetector = com.EE5.util.GlobalResources.getInstance().getPatternDetector();
    if (patternDetector != null) {
        patternDetector.destroy();
    }
}