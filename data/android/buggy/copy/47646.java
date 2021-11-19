@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.layout_recycler_view, container);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recycler_view)));
    return view;
}