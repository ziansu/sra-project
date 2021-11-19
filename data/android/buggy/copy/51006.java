@java.lang.Override
public void terminate() {
    this.getShip().removeBullet(this);
    this.isTerminated = true;
    this.ship = null;
}