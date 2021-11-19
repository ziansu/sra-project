@java.lang.Override
public void finishUpdate(android.view.View container) {
    if ((fragmentTransaction) != null) {
        fragmentTransaction.commitAllowingStateLoss();
    }
    fragmentTransaction = null;
    fragmentManager.executePendingTransactions();
}