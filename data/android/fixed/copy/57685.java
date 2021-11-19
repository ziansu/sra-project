@java.lang.Override
public void close() throws java.lang.Exception {
    treePosAlgorithm.close();
    transClosureAlgorithm.close();
    labelSetAlgorithm.close();
    super.close();
    readers = null;
}