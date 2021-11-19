@java.lang.Override
public boolean shouldEat(oortcloud.hungryanimals.entities.capability.ICapabilityHungryAnimal cap) {
    return ((cap.getHunger()) + (java.util.Collections.min(map.values()))) < (cap.getMaxHunger());
}