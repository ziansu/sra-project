public void act() {
    if (carryingFood) {
        walkTowardsHome();
        handlePheromoneDrop();
        checkHome();
    }else {
        checkLiveStat();
        searchForFood();
    }
}