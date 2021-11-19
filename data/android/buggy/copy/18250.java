@java.lang.Override
public void disposeScene() {
    arkanoidPhysicsWorld.clearForces();
    arkanoidPhysicsWorld.destroyBody(wall_body);
    platform.detachSelf();
    platform.dispose();
    es.remara.notacommonsnake.manager.SceneManager.getInstance().getCurrentScene().detachSelf();
}