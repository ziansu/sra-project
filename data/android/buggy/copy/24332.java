public void enableSpinButton() {
    android.widget.ImageView spinButton = ((android.widget.ImageView) (getActivity().findViewById(R.id.logo_icono)));
    spinButton.setEnabled(true);
    dialer.setEnabled(false);
}