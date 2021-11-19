@java.lang.Override
public void onErrorCreationCustomer() {
    android.widget.Toast.makeText(getActivity(), "Email is already in use, choose a different one", Toast.LENGTH_SHORT).show();
    android.widget.Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
}