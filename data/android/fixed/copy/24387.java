private void onError() {
    if (null != (getActivity())) {
        android.widget.Toast.makeText(getActivity(), getActivity().getString(R.string.could_not_redact), Toast.LENGTH_SHORT).show();
    }
}