@java.lang.Override
public void onClick(android.view.View v) {
    ru.mail.park.android_wikipedia.fragments.MainFragment.refresh();
    ru.mail.park.android_wikipedia.fragments.SavedArticlesFragment.refresh();
    new ru.mail.park.android_wikipedia.ServiceHelper().cleanDB(getActivity());
}