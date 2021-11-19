@java.lang.Override
public void onBackPressed() {
    mDrawerLayout.closeDrawers();
    if (!(isFinishing()))
        colorDialog.show();
    
}