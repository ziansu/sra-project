@java.lang.Override
public float getWeight() {
    mhfc.net.common.entity.mob.EntityDeviljho deviljho = this.getEntity();
    target = deviljho.getAttackTarget();
    if ((target) != null)
        return DONT_SELECT;
    
    return (rng().nextFloat()) * 3;
}