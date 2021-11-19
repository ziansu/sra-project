public void generateMaze() {
    simulatedMaze.generateRandom(0.7);
    myRobot.giveMaze(simulatedMaze);
    reset();
}