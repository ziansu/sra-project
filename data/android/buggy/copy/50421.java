public org.gitlab.api.models.GitlabGroup newGroup(java.lang.String name) {
    org.gitlab.api.models.GitlabGroup group = userConn.createGroup(name);
    java.lang.System.out.println((((group.getName()) + ", ") + (group.getId())));
    return group;
}