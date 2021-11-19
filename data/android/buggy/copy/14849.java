public java.lang.Iterable<org.oreland.teambuilder.entity.Activity> getSortedActivities(java.util.Comparator<org.oreland.teambuilder.entity.Activity> comp) {
    java.util.TreeSet<org.oreland.teambuilder.entity.Activity> activities = new java.util.TreeSet(comp);
    activities.addAll(this.activities.values());
    return activities;
}