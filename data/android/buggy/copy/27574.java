@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    adapter = new com.alexgilleran.hiitme.activity.ProgramListFragment.ProgramAdapter(com.alexgilleran.hiitme.data.ProgramDAOSqlite.getInstance(getActivity().getApplicationContext()).getProgramList());
    setListAdapter(adapter);
}