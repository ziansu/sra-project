@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.harryjamesuk.ribbit.InboxFragment();
        case 1 :
            return new com.harryjamesuk.ribbit.FriendsFragment();
    }
    return new com.harryjamesuk.ribbit.InboxFragment();
}