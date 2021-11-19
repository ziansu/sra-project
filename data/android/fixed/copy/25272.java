@java.lang.Override
public boolean attackEntityFrom(net.minecraft.util.DamageSource damageSource, float f) {
    return ((this.entityMainTrain) != null) && (entityMainTrain.attackEntityFrom(damageSource, f));
}