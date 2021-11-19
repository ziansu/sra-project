public void setup() {
    frameRate(60);
    map.loadMap("Resources/Maps/map1.txt");
    tiles = map.getTiles();
    animation.loadBackground("Resources/Images/Backgrounds");
}