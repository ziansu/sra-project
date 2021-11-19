@java.lang.Override
public void updateLogic() {
    if (((y) < 0) || ((y) > (((Main.HEIGHT) - 15) - 28)))
        veloY *= -1;
    
    y += veloY;
}