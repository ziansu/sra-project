@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return net.hokiegeek.android.dondeestas.MapFragment.newInstance();
        case 1 :
            return net.hokiegeek.android.dondeestas.PersonFragment.newInstance();
    }
    return null;
}