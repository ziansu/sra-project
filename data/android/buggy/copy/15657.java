@java.lang.Override
public void run() {
    super.run();
    for (; ;) {
        nextCharacter();
        try {
            java.lang.Thread.sleep(getPauseTime());
        } catch (java.lang.InterruptedException ie) {
            return ;
        }
    }
}