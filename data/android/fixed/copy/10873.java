@java.lang.Override
public void remove(com.managed.revenuetracker.to.Revenue revenue) {
    com.managed.revenuetracker.adapter.RevListAdapter.revenues.remove(revenue);
    notifyDataSetChanged();
    super.remove(revenue);
}