@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.add.toeic.activity.DetailWordActivity.PlaceholderFragment.newInstance((position + 1), mArrayList, mGroupWord, mWord);
}