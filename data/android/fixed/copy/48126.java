@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    friends = new java.util.ArrayList<>();
    newfriends = new java.util.ArrayList<>();
    getfriends();
    bindViews();
    populate();
    getNewfriends();
}