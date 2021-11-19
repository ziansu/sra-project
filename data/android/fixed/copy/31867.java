private com.simplaapliko.trips.di.module.EditPlaceModule getEditPlaceModule() {
    com.simplaapliko.trips.di.module.EditPlaceModule editPlaceModule;
    if ((mEventType) == (PlaceNavigator.EventType.EDIT_PLACE)) {
        editPlaceModule = com.simplaapliko.trips.di.module.EditPlaceModule.getEditInstance(mTripId, mPlaceId);
    }else {
        editPlaceModule = com.simplaapliko.trips.di.module.EditPlaceModule.getCreateInstance(mTripId);
    }
    return editPlaceModule;
}