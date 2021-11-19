@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return new com.simplecity.amp_library.ui.fragments.WidgetFragment().newInstance(layouts[position]);
}