public void Draw(java.awt.Graphics g) {
    for (Missile eachMissile : mMissileList) {
        eachMissile.Draw(g);
        if ((eachMissile.getCurrentDistanceChange()) > 200) {
            mMissileList.remove(eachMissile);
        }
    }
}