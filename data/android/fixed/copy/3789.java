public issuetracking.Sprint getSprintById(int sprintid) {
    issuetracking.Sprint toReturn = em.find(issuetracking.Sprint.class, sprintid);
    return toReturn;
}