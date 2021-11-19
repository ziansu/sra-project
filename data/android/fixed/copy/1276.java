public void updateRobot() {
    if (inMotion()) {
        motion.executeMotion(this);
    }
    updateOBBs();
}