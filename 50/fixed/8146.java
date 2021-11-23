public void updatePuntRetStats(int yds, boolean fumb, boolean td) {
    puntrettds += yds;
    if (fumb)
        (fumbles)++;
    
    if (td && (!fumb))
        (puntrettds)++;
    
    (puntreturns)++;
}