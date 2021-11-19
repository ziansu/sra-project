public int getResourceID(java.lang.String resourceName) {
    return activityContext.getResources().getIdentifier(resourceName, "drawable", activityContext.getPackageName());
}