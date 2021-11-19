@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.support.v7.widget.RecyclerView rv = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.f1_recyclerview)));
    setupRecyclerView(rv);
    initiliazeYoutubeFragment();
}