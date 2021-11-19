@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_main_container, new com.ritwik.android.madfbla201415.SignupFragment()).addToBackStack(null).commit();
    getActivity().finish();
}