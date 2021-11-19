@java.lang.Override
public int play(java.util.List<com.github.steevedroz.blackhole.BlackHoleBox> boxes) {
    ai.steevedrozminmax.AlphaBeta alphaBeta = new ai.steevedrozminmax.AlphaBeta(this, new com.github.steevedroz.blackhole.HumanPlayer(javafx.scene.paint.Color.YELLOW, 0), size);
    return alphaBeta.getMove(boxes, depth, 1, java.lang.Integer.MAX_VALUE).box;
}