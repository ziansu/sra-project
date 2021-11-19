public static java.util.List<server.Entity> getEntitiesAt(int x, int y) {
    return new java.util.ArrayList(server.Server.objects.subSet(new server.Server.Placeholder(x, y, false), new server.Server.Placeholder(x, y, true)));
}