@java.lang.Override
public void onClick(android.view.View view) {
    getActivity().startActivityForResult(pickIntent, com.olehm.criminalintent.controller.crime.details.CrimeFragment.REQUEST_CONTACT);
}