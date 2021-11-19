@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_tab_operations, container, false);
    loadUserRequestByDate();
    return rootView;
}