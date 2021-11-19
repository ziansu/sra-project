@java.lang.Override
public void notifyTime(double dt) {
    (contador)++;
    if ((contador) > 20) {
        if (canDestroy) {
            checkColision();
        }
        contador = 0;
    }
    this.waveManager.notifyTime(dt);
}