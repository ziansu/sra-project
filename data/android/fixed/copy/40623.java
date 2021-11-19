public void changeToSelectedSection(com.mcgearybros.vroomvroom.NavigationSubItem selectedSubItem) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction selectedTransaction = fragmentManager.beginTransaction();
    selectedTransaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
    changeToNewSection(selectedSubItem, selectedTransaction);
}