@java.lang.Override
public void load(net.citizensnpcs.api.util.DataKey key) {
    waypoints.clear();
    for (net.citizensnpcs.api.util.DataKey root : key.getRelative("waypoints").getIntegerSubKeys()) {
        waypoints.add(new net.citizensnpcs.trait.waypoint.Waypoint(net.citizensnpcs.util.StorageUtils.loadLocation(root)));
    }
}