@java.lang.Override
public boolean canKill(CrandallGridWorld.TeamBug bugToKill) {
    if (!(sameTeam(bugToKill)))
        return true;
    else
        if (bugToKill instanceof CrandallGridWorld.Geek.GeekAssassinBug)
            return false;
        else
            return false;
        
    
}