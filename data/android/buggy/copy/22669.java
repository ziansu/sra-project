@java.lang.Override
public void onClick(android.view.View view) {
    com.barterbayucsb.barterbay.MyOffersActivity.currentOffer = com.barterbayucsb.barterbay.MyOffersActivity.LocalOffers.get((3 + (7 * ((page) - 1))));
    android.content.Intent intent = new android.content.Intent(this, com.barterbayucsb.barterbay.ViewMyPost.class);
    startActivity(intent);
}