@java.lang.Override
public void onTaskDone() {
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportProgressBarIndeterminateVisibility(false);
    getActivity().finish();
}