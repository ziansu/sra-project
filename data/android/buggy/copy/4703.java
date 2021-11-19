public void deleteAccount(int account) {
    acts.remove(account);
    fireTableDataChanged();
}