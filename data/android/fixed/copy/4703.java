public void deleteAccount(int account) {
    acts.remove(account);
    this.fireTableDataChanged();
}