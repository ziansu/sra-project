@java.lang.Override
public float calculateCelestialAngle(long worldTime, float partialTicks) {
    return (celestialHelper.calculateCelestialAngle(worldTime, partialTicks)) + 0.25F;
}