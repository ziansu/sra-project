public void showPopUp(com.mobideck.appdeck.AppDeckFragment origin, java.lang.String absoluteURL) {
    com.mobideck.appdeck.AppDeckFragment fragment = initPageFragment(absoluteURL);
    fragment.isPopUp = true;
    pushFragment(fragment);
}