@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof org.grassroot.android.fragments.ViewTaskFragment.ViewTaskListener)
        this.taskViewListener = ((org.grassroot.android.fragments.ViewTaskFragment.ViewTaskListener) (context));
    else
        this.taskViewListener = null;
    
}