public void addRefreshAccounts(com.superkeychain.keychain.entity.Account account) {
    if ((account != null) && ((adapter) != null)) {
        this.accounts.add(account);
        adapter.notifyDataSetChanged();
    }
}