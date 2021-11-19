@java.lang.Override
public int levelOf(int a) {
    int index = indexes[a];
    return lcaTree.depthOf(index);
}