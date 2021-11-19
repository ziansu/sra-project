private void playerDeath(org.newdawn.slick.state.StateBasedGame sbg) {
    mg.decreaselifeCount();
    if ((mg.getLifeCount()) <= 0) {
        mg.score = score;
        sbg.enterState(2);
    }else {
        sbg.enterState(1);
    }
}