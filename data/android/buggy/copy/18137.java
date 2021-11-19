@java.lang.Override
public com.re.reverb.ui.OverlayFragment getItem(int i) {
    switch (i) {
        case 0 :
            currentFragment = 0;
            return userProfileFragment;
        case 1 :
            currentFragment = 1;
            return newFeedFragment;
        case 2 :
            currentFragment = 2;
            return regionsFragment;
        default :
            return null;
    }
}