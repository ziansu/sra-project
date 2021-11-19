public void stepCase() {
    for (Ant a : ants)
        a.stepAnts();
    
    if (t)
        tower.stepTower();
    
}