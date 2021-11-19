@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    TAG = com.boun.swe.wawwe.App.getInstance().getString(R.string.title_menu_menuDetail);
}