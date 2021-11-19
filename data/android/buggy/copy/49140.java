@butterknife.OnClick(value = R.id.admin_user_delete)
public void onDeleteClick(android.view.View view) {
    blueprint.com.sage.utility.network.NetworkUtils.logoutCurrentUser(getActivity());
}