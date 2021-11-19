public void startTroll() {
    map = generateMap();
    generateTrolls(map);
    generateHero(map);
    drawMaze(map);
    getGameplay(map);
}