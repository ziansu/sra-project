public void onDistrictSelection() {
    if (!(selectedDistrict.isLoaded())) {
        districtManagementBean.loadDistrict(selectedDistrict, selectedYear, false);
    }
}