@butterknife.OnClick(value = R.id.profile_logout_button)
public void logout() {
    profilePresenter.logout();
    getActivity().finish();
}