public void workAt(hillbillies.model.Cube cube) {
    if (this.canHaveAsWorkAtCube(cube)) {
        this.setWorkAtCube(cube);
        this.setActivity(Activity.WORKING);
    }
}