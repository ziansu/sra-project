@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.util.Log.d(com.teamtreehouse.ribbit.ui.InboxFragment.TAG, "onViewCreated");
    retrieveMessages();
}