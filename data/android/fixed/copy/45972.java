public void save() {
    synchronized(this) {
        try {
            net.minecraft.world.storage.MapStorage data = getData();
            data.setData(getName(), this);
        } catch (java.lang.NullPointerException e) {
        }
    }
}