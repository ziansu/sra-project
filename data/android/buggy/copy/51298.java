@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    android.util.Log.d(yandex.muratov.translator.ui.bookmarks.BasePageFragment.TAG, java.lang.String.format("in bar: adapter=%d, list=%d", adapter.hashCode(), listOfElements.hashCode()));
    requestList(s);
}