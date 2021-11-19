@java.lang.Override
public void binderDied() {
    binder.unlinkToDeath(this, 0);
}