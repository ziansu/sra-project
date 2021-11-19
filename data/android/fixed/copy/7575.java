private synchronized void signal(int sectionNumber) {
    try {
        tsi.setSpeed(id, speed);
    } catch (CommandException e) {
        e.printStackTrace();
    }
    Train.critSems[sectionNumber].release();
}