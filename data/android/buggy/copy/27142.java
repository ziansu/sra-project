@java.lang.Override
public void onDetach() {
    super.onDetach();
    getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
}