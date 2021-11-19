public java.util.List<java.lang.String> getAttacks() {
    java.util.List<java.lang.String> attackNames = new java.util.ArrayList();
    for (net.sparkzz.visionless.game.Attack attack : attacks)
        attackNames.add(attack.getName());
    
    return attackNames;
}