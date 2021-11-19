@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    menuhandler = new com.nag.android.stm.MenuHandler(getActivity(), this, this);
    setHasOptionsMenu(true);
}