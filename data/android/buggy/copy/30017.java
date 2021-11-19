@java.lang.Override
public int compareTo(final org.commonjava.maven.atlas.ident.ref.ProjectRef o) {
    int comp = groupId.compareTo(o.groupId);
    if (comp == 0) {
        comp = artifactId.compareTo(o.artifactId);
    }
    return 0;
}