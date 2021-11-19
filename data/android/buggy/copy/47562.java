@java.lang.Override
public void run() {
    tmodel.setMode(piece, mode);
    tmodel.refresh();
    if (turn.equals(piece)) {
        decideMakeRndOrAutoMove();
    }
}