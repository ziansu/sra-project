@java.lang.Override
public int compareTo(org.phenotips.data.permissions.AccessLevel o) {
    if ((o != null) && (o instanceof org.phenotips.projects.access.AbstractProjectAccessLevel)) {
        return this.compareTo(o);
    }
    return java.lang.Integer.MIN_VALUE;
}