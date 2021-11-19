private void initializeCitiesSpinner() {
    mCity.setAdapter(new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_spinner_dropdown_item, mCityList));
    mCity.setSelection(0);
}