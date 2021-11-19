public void logout() {
    mPlaces = java.util.Collections.EMPTY_LIST;
    mPlacesSubject.onNext(mPlaces);
}