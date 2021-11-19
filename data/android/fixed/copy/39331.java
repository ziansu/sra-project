public boolean addToQueue(java.lang.String player, int dim, double x, double y, double z) {
    return this.queue.add(new net.quetzi.qutilities.helpers.TeleportQueue.TeleportEntry(player.toLowerCase(), dim, x, y, z));
}