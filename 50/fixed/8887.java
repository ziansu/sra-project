private void setListViewAdapter() {
    if ((m_listViewAdapter) == null) {
        m_listViewAdapter = new com.asksven.betterbatterystats.StatsAdapter(this, getStatList());
        setListAdapter(m_listViewAdapter);
    }
}