@java.lang.Override
public void onChildAdded(sample.DataSnapshot snapshot, java.lang.String previousChildKey) {
    bidItem = snapshot.getValue(sample.BidItem.class);
    fireBaseItems.add(bidItem);
}