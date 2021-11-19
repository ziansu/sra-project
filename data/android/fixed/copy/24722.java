@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(getActivity(), edu.josephkorang.criminalintent.CrimeCameraActivity.class);
    startActivityForResult(i, edu.josephkorang.criminalintent.CrimeFragment.REQUEST_PHOTO);
}