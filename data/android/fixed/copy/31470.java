@java.lang.Override
public float getWeight() {
    mhfc.net.common.entity.mob.EntityDeviljho deviljho = this.getEntity();
    target = deviljho.getAttackTarget();
    return (rng().nextFloat()) * 3;
}