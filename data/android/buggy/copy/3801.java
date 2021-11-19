public void onRegistrationSuccess() {
    com.taibah.busservice.utils.Helpers.closeKeyboard(getActivity(), etDriverContactNumber.getWindowToken());
    android.widget.Toast.makeText(getActivity(), "Registration successful", Toast.LENGTH_SHORT).show();
    getActivity().onBackPressed();
}