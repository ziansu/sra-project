private void buildHelices() {
    if ((groups.length) < 5)
        return ;
    
    checkSetHelix(4, SecStrucType.helix4);
    checkSetHelix(3, SecStrucType.helix3);
    checkSetHelix(5, SecStrucType.helix5);
    checkSetTurns();
}