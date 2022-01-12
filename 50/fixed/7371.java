@java.lang.Override
public void onLoadMore(int currentPage) {
    if ((contactsListAdapter) != null) {
        contactsListPresenter.setCurrentPage(currentPage);
        contactsListPresenter.getContacts();
    }
}