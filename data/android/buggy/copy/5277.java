@java.lang.Override
public void onClick(android.view.View v) {
    setNewValues();
    com.codepath.qzineat.fragments.ProfileFragment profileFragment = new com.codepath.qzineat.fragments.ProfileFragment();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.flContent, profileFragment);
    fragmentTransaction.commit();
}