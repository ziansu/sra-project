@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mFile = new java.io.File(getActivity().getExternalFilesDir(null), "pic.jpg");
}