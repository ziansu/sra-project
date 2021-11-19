@java.lang.Override
public void customTick() {
    thirst += 1000;
    factor.put("WaterSource", ((thirst) > 0 ? thirst : 0));
}