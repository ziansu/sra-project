@java.lang.Override
public void dispose() {
    skin.dispose();
    for (com.badlogic.gdx.scenes.scene2d.Actor stageActor : stage.getActors()) {
        stage.getActors().removeValue(stageActor, true);
    }
}