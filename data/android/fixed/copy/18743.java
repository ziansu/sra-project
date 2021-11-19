protected void onStart() {
    super.onStart();
    if ((com.hello.hegberg.warondemand.BiddingChooseItem.bidAccepted) == true) {
        com.hello.hegberg.warondemand.BiddingChooseItem.bidAccepted = false;
    }
    search();
    adapter.notifyDataSetChanged();
}