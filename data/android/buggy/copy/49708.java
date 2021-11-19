public void act() {
    if (Greenfoot.mouseClicked(this)) {
        BaseGraph world = ((BaseGraph) (getWorld()));
        fillColor = world.selectedColor();
        world.setCountryColor(id);
    }
}