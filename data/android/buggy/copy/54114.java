@java.lang.Override
public void onClick(android.view.View v) {
    if ((fragment.getArguments()) == null) {
        fragment.getActivity().onBackPressed();
    }
    fragment.getActivity().onBackPressed();
}