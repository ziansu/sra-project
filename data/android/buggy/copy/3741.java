@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.hanani.android.drawer.FragmentFourOne.newInstance((position + 1));
        case 1 :
            return com.hanani.android.drawer.FragmentFourTwo.newInstance(position);
    }
    return null;
}