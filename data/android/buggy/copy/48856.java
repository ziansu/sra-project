@java.lang.Override
public void onDetach() {
    super.onDetach();
    mActionBarIconManagementListener = null;
    mFragmentManagementListener = null;
}