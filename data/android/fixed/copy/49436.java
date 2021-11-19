private void returnResult() {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.example.marco.criminalintent.CrimeFragment.HAS_CRIME_CHANGED, mHasCrimeChanged);
    data.putExtra(com.example.marco.criminalintent.CrimeFragment.ARG_CRIME_ID, mCrime.getId());
    getActivity().setResult(Activity.RESULT_OK, data);
}