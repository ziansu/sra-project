@java.lang.Override
public void onStart() {
    super.onStart();
    transactionHistoryPresenter.onStart();
    transactionHistoryPresenter.transactionHistory(transactionHistory, io.soramitsu.iroha.view.fragment.TransactionHistoryFragment.RefreshState.RE_CREATED_FRAGMENT);
}