private void showMissingPermissionError() {
    PermissionUtils.PermissionDeniedDialog.newInstance(true).show(getActivity().getFragmentManager(), "dialog");
}