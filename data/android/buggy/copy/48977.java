@java.lang.Override
public void update() {
    total.clear();
    java.util.ArrayList<java.lang.String> total = Claim.getTotal();
    totalAdapter.notifyDataSetChanged();
}