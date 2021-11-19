@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mListener = ((com.akash.vachana.fragment.KathruListFragment.OnKathruListFragmentInteractionListener) (getArguments().getSerializable("listener")));
}