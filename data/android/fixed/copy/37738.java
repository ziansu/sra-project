@java.lang.Override
public com.globant.practice.presentation.view.adapter.SubscriberAdapter.SubscriberViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.subscriber_list_item, parent, false);
    com.globant.practice.presentation.view.adapter.SubscriberAdapter.SubscriberViewHolder listHomeViewHolder = new com.globant.practice.presentation.view.adapter.SubscriberAdapter.SubscriberViewHolder(itemView);
    return listHomeViewHolder;
}