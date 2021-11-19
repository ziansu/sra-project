@java.lang.Override
public void onCompleted() {
    if (!(completed)) {
        child.onCompleted();
    }
}