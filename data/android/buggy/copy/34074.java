public dev.wolveringer.bungeeutil.packets.PacketPlayOutEntityProperties addProperty(dev.wolveringer.bungeeutil.packets.PacketPlayOutEntityProperties.EntityProperty prop) {
    this.properties = new java.util.ArrayList<>();
    this.properties.add(prop);
    return this;
}