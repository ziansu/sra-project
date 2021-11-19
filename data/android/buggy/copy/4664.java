@java.lang.Override
public secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    timber.log.Timber.d("creating viewholder...");
    android.view.View itemView = android.view.LayoutInflater.from(context).inflate(R.layout.app_view_holder, parent, false);
    return new secureapps.com.fitsec.RealmAppAdapter.SecureAppViewHolder(itemView);
}