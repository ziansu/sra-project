@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        currentFragment = new advancedui.android.bootcamp.end.advancedui.FragmentWillBeContent();
        return new advancedui.android.bootcamp.end.advancedui.FragmentWillBeContent();
    }else {
        return new advancedui.android.bootcamp.end.advancedui.FragmentThereWasContentContent();
    }
}