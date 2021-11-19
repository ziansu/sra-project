@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.rupik.newstoday.NewsCategory category = newsCategories.get(position);
    return com.rupik.newstoday.SuperAwesomeCardFragment.newInstance(position, category);
}