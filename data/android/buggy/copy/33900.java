@java.lang.Override
public void updateBall(java.util.UUID uuid, double x, double y, javafx.scene.paint.Color color) {
    if (uuid == (localBall.uuid))
        return ;
    
    remoteBall.setXPosition(x);
    remoteBall.setYPosition(y);
}