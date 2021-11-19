@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.dailynews.dailynews.widget.fragment.PageFragment.newInstance(tabTitles[position]);
}