public void workAt(hillbillies.model.Cube cube) {
    if (this.canHaveAsWorkAtCube(cube)) {
        java.lang.System.out.println(("workat: " + (cube.toString())));
        this.setWorkAtCube(cube);
        this.setActivity(Activity.WORKING);
    }
}