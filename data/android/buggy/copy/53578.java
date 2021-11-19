@java.lang.Override
public boolean onQueryTextChange(java.lang.String searchQuery) {
    m_block_adapter.filter(searchQuery.toString().trim());
    lsvUsers.invalidate();
    return true;
}