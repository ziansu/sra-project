public void checkLife() {
    synchronized(lives) {
        for (com.mnet.antivirus.Life life : lives) {
            if ((life.getHealth()) == 0) {
                dead.add(life);
            }
        }
    }
}