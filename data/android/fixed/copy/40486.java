public int getCount() {
    return (_googleAccounts.length) == 0 ? (GOOGLE_ACCOUNT_START) - 1 : (_googleAccounts.length) + (GOOGLE_ACCOUNT_START);
}