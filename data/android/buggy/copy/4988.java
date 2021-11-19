private void drawPowers(org.newdawn.slick.Graphics graphics) throws com.sem.btrouble.view.SlickException {
    for (com.sem.btrouble.view.PowerUp power : com.sem.btrouble.view.Model.getShortPower()) {
        power.draw();
    }
}