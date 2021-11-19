public boolean addToQueue(java.lang.String player, int dim, int x, int y, int z) {
    return this.queue.add(new net.quetzi.qutilities.helpers.TeleportQueue.TeleportEntry(player, dim, x, y, z));
}