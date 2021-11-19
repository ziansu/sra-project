protected void deleteTeam(net.acampadas21.teamapi.groups.Team t) {
    if (isTeam(t.getName())) {
        net.acampadas21.teamapi.TeamManager.db.standardQuery((("DELETE TABLE " + (t.getName())) + ";"));
    }
}