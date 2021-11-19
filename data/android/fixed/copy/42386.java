@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mCurrentTrip = getArguments().getParcelable(Trip.PARCEL_KEY);
}