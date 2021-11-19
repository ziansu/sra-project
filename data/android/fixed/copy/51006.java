@java.lang.Override
public void terminate() {
    if ((this.getShip()) != null) {
        this.getShip().removeBullet(this);
    }
    this.isTerminated = true;
    this.ship = null;
}