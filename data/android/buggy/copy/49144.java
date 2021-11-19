@java.lang.Override
public void interact(CrandallGridWorld.TeamBug bug) {
    if (!(sameTeam(bug))) {
        this.kill(bug);
    }
}