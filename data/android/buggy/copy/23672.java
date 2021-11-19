@java.lang.Override
public void onClick(android.view.View view) {
    android.app.FragmentTransaction fm = getFragmentManager().beginTransaction();
    fm.addToBackStack(null);
    fm.replace(R.id.profileFragment, new com.example.thang.mobile_dating_app_v20.Fragments.EditProfile());
    fm.commit();
}