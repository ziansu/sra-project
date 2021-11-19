@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(null, "Browse fragment onResume");
    andrzej.example.com.wordunscrambler.fragments.tabs.DictionariesFragment.otherWindowOpened = true;
}