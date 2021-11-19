public void update(Model.Player hero) {
    if (checkCollision(hero)) {
        Model.MainLoop.changeCurrentLevel(destination);
        Model.PlayerPhysics.updateWindowVars();
        java.lang.System.out.println(("Changed level to: " + (destination)));
    }
}