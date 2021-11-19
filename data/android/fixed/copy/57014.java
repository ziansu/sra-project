@java.lang.Override
public awstreams.serry.zadfreshapplication.adapters.RepositoriesAdapter.RepositoryHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
    awstreams.serry.zadfreshapplication.adapters.RepositoriesAdapter.RepositoryHolder productHolder = new awstreams.serry.zadfreshapplication.adapters.RepositoriesAdapter.RepositoryHolder(view);
    return productHolder;
}