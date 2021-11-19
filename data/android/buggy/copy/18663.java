private void undoRunStats(int yds, boolean fumb, boolean td) {
    runyds -= yds;
    if (fumb)
        (fumbles)--;
    
    if (td && (!fumb))
        (runtds)--;
    
    (runatmpts)--;
}