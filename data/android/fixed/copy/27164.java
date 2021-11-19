private void trustKeyChange() {
    org.kontalk.provider.UsersProvider.trustUserKey(getActivity(), mUserJID);
    invalidateContact();
}