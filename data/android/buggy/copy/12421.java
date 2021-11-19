@java.lang.Override
public void onPageSelected(int position) {
    if (position == 0) {
        transactionAdapter.pendingTransactionFragment.refresh();
    }else
        if (position == 1) {
            transactionAdapter.completeTransactionFragment.refresh();
        }
    
}