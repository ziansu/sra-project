public void startTroll() {
    map = generateMap();
    generateTrolls(map);
    generateHero(map);
    while (true) {
        drawMaze(map);
        getGameplay(map);
    } 
}