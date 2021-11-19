public se.liu.ida.erihe763.tddd78.tetris.Poly spawnPoly() {
    return tetrominoMaker.getPoly(new java.util.Random().nextInt(tetrominoMaker.getNumberOfTypes()));
}