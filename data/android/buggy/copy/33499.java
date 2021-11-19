public void syncAllWindows() {
    for (java.lang.String activityClass : activitiesStack.keySet()) {
        syncAllWindows(activityClass);
    }
}