private void requestAddressData() {
    if (mIsJsonDataEnable) {
        com.eruntech.addresspicker.services.LoadXmlAddressDataService service = new com.eruntech.addresspicker.services.LoadXmlAddressDataService(this);
        service.startToParseData(mIsSortedByPronunciation);
    }else {
        com.eruntech.addresspicker.services.LoadJsonAddressDataService jsonService = new com.eruntech.addresspicker.services.LoadJsonAddressDataService(this);
        jsonService.startToParseData();
    }
}