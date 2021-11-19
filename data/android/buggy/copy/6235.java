@java.lang.Override
public void update() {
    java.lang.System.out.println();
    if (Gdx.input.isKeyJustPressed(Input.Keys.L)) {
        if (isDay) {
            changeLightType(com.github.jotask.tusk.states.play.world.environment.DayCycle.LIGHT.NIGHT);
        }else {
            changeLightType(com.github.jotask.tusk.states.play.world.environment.DayCycle.LIGHT.DAY);
        }
        isDay = !(isDay);
    }
}