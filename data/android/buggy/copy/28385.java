@java.lang.Override
public void onClick(android.view.View v) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    fragString = com.kree.keehoo.yourcarinfo.DialogFragments.EditFieldFragment.newInstance(this, "carBrand");
    fragString.show(ft, "carModel");
    declineEdit();
}