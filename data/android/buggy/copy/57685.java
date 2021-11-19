@java.lang.Override
public void close() throws java.lang.Exception {
    sorter.close();
    treePosAlgorithm.close();
    transClosureAlgorithm.close();
    labelSetAlgorithm.close();
    super.close();
    readers = null;
}