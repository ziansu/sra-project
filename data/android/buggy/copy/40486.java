public int getCount() {
    return (_googleAccounts.length) == 0 ? GOOGLE_ACCOUNT_START : (_googleAccounts.length) + (GOOGLE_ACCOUNT_START);
}