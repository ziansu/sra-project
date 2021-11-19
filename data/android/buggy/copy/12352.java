public static java.util.Set<server.Entity> getEntitiesAt(int x, int y) {
    return server.Server.objects.subSet(new server.Server.Placeholder(x, y, false), new server.Server.Placeholder(x, y, true));
}