@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.labs.okey.oneride.myrides.GeneralMyRidesFragment.getInstance();
    }
    return null;
}