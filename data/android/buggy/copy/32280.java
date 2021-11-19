@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    towerDefense.maps.remove(_selectedMap);
    updateMapList();
}