public Team getTeam(int id) {
    for (Team t : this.teams) {
        if ((t.getId()) == id) {
            return t;
        }
    }
    return null;
}