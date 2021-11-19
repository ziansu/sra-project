@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    mCurrentView = inflater.inflate(R.layout.fragment_friend_request, container, false);
    mContext = getActivity().getApplicationContext();
    loadFriendRequest();
    return mCurrentView;
}