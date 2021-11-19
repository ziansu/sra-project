private void readPreferences() {
    mSearch = sharedPreferences.getString("search", ApiHelper.API_TOP_RATED).toUpperCase().replace("_", " ");
    getActivity().setTitle(mSearch);
}