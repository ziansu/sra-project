@java.lang.Override
public org.symcom.bischoff.zslemtbdd.ZSLEMTBDDNode getResult() {
    mgr.removeDuplicatesInTree(root);
    return root;
}