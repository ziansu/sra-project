@java.lang.Override
public void run() {
    com.acme.server.world.Area spawnArea = worldManager.getWorld().getPlayerSpawnAreas().get(checkpointId);
    pcm.get(getClient()).setSpawnArea(spawnArea);
}