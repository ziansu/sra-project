public java.util.ArrayList<draft.Pick> get(draft.Hero hero, boolean withOrAgainst) {
    if (withOrAgainst)
        return synergyPicks.get(hero);
    else
        return versusPicks.get(hero);
    
}