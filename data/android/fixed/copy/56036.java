public void refreshDatas() {
    list = com.example.data.Provider.getInstance().datas.getUsers(mainActivity);
    listUserFragment.updateViews(list);
}