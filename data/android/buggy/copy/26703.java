@java.lang.Override
public float getLinkageDistance(net.minecraft.entity.item.EntityMinecart cart) {
    float dist = (this.getOptimalDistance(cart)) + 2.4F;
    return dist;
}