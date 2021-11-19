@java.lang.Override
public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
    return (view instanceof android.widget.ListView) && (((nl.tue.san.ui.TaskSetFragment.TaskAdapter) (((android.widget.ListView) (view)).getAdapter())).taskSet.equals(object));
}