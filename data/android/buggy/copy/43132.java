private void createMap() {
    java.lang.String mapName = "AntWorld.png";
    java.awt.image.BufferedImage map = antworld.client.Util.loadImage(mapName, null);
    java.lang.System.out.println(("Is map null? map=" + map));
    readMap(map);
}