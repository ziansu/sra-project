@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.tamerbarsbay.depothouston.presentation.view.fragment.MapSearchFragment.REQUEST_CODE_LOCATION_PERMISSION);
}