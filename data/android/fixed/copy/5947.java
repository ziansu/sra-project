public int getAction(gr.PacManAI.GameState gs) {
    int direction = gs.closestPillDir();
    return direction;
}