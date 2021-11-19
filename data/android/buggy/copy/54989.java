@java.lang.Override
public void onItem(@android.support.annotation.Nullable
java.lang.Boolean item) {
    if (java.lang.Boolean.TRUE.equals(item)) {
        addBookmark(title, url);
    }else {
        deleteBookmark(title, url);
    }
}