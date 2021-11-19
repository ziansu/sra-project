public void collision() {
    frame.GameFrame.puck.checkCollisionPlayer(frame.GameFrame.paint.player1, Paint.puck);
    frame.GameFrame.puck.checkCollision(Paint.puck, Paint.width, Paint.height, Paint.goalY, Paint.diameterPlayer);
}