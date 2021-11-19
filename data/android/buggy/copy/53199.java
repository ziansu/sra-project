@java.lang.Override
public int compareTo(org.cytoscape.cpathsquared.internal.NvpListItem o) {
    return (name) != null ? this.name.compareTo(o.getName()) : this.value.compareTo(o.getValue());
}