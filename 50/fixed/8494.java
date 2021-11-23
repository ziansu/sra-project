private dhbw.karlsruhe.it.solar.core.stages.Spacestation placeNewStation(java.lang.String name, com.badlogic.gdx.math.Vector2 startlocation, dhbw.karlsruhe.it.solar.player.Player owner) {
    dhbw.karlsruhe.it.solar.core.stages.Spacestation newStation = dhbw.karlsruhe.it.solar.core.stages.Spacestation.placeNewStation(name, startlocation, owner);
    addActor(newStation);
    return newStation;
}