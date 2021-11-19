@java.lang.Override
public void run() {
    for (java.lang.String s : fileHolder) {
        retrieveData(s);
        mf.loader();
    }
    setElementsToNodes();
}