public int getRequiredResources() {
    int resources = org.catrobat.catroid.content.bricks.Brick.NO_RESOURCES;
    for (org.catrobat.catroid.content.bricks.Brick brick : brickList) {
        resources |= brick.getRequiredResources();
    }
    return resources;
}