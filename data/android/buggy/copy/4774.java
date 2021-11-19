@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.os.Bundle args = getArguments();
    loadPage(args.getString(ru.yandex.money.android.fragments.WebFragment.KEY_URL), ru.yandex.money.android.utils.Bundles.readStringMapFromBundle(args.getBundle(ru.yandex.money.android.fragments.WebFragment.KEY_POST_DATA)));
}