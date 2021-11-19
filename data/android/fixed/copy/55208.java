@java.lang.Override
public void onClick(final android.view.View v) {
    android.support.v4.app.FragmentActivity activity = getActivity();
    com.example.alexm.kunzhutproject.MainActivity mainActivity = ((com.example.alexm.kunzhutproject.MainActivity) (activity));
    mainActivity.showFragment(new com.example.alexm.kunzhutproject.ChatFragmant(), true);
}