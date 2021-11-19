@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.listfrag, container, false);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (rootView.findViewById(R.id.recyclerView)));
    return rootView;
}