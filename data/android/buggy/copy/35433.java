@java.lang.Override
public int getItemCount() {
    return ((accountsWithoutCurrent.size()) + 1) + (de.geeksfactory.opacclient.frontend.DrawerAccountsAdapter.FOOTER_COUNT);
}