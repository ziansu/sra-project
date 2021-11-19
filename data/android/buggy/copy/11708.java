public void resize(int width, int height) {
    for (maxfat.spacesurvival.overlap2d.StageStack.StageWrapper s : this.stack) {
        s.stage.getViewport().update(width, height);
    }
}