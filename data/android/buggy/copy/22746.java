@java.lang.Override
public boolean equals(java.lang.Object other) {
    if ((other == null) || (!(other instanceof com.maxim.vcs_objects.VcsCommit))) {
        return false;
    }
    return (id) == (((com.maxim.vcs_objects.VcsCommit) (other)).id);
}