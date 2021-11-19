@java.lang.Override
public void update() {
    if (Gdx.input.isKeyJustPressed(Input.Keys.L)) {
        if (isDay) {
            changeLightType(com.github.jotask.tusk.states.play.world.environment.DayCycle.LIGHT.NIGHT);
        }else {
            changeLightType(com.github.jotask.tusk.states.play.world.environment.DayCycle.LIGHT.DAY);
        }
        isDay = !(isDay);
    }
}