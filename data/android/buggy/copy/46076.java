@java.lang.Override
public void onClick(android.view.View v) {
    invalidateSavedGame();
    android.content.Intent intent = com.matthias.android.amginori.fragments.BoardFragment.newIntent(getActivity(), mLevel);
    startActivity(intent);
}