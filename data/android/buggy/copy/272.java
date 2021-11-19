@java.lang.Override
public void update() {
    java.util.ArrayList<java.lang.String> total = Claim.getTotal();
    totalAdapter.notifyDataSetChanged();
}