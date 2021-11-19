public static com.grp10.codepath.travelmemo.fragments.TripPhotoFragment newInstance(android.content.Context context, java.lang.String tripId) {
    com.grp10.codepath.travelmemo.fragments.TripPhotoFragment tripPhotoFragment = new com.grp10.codepath.travelmemo.fragments.TripPhotoFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(com.grp10.codepath.travelmemo.fragments.TripPhotoFragment.ARG_TRIP_ID, tripId);
    tripPhotoFragment.setArguments(bundle);
    return tripPhotoFragment;
}