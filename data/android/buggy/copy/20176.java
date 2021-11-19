@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    dataSource = org.melayjaire.boimela.data.BookDataSource.getInstance(getActivity());
    dataSource.open();
}