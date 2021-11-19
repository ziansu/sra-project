@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.barterbayucsb.barterbay.Offer> offers) {
    for (com.barterbayucsb.barterbay.Offer offer : offers) {
        com.barterbayucsb.barterbay.DispLocalOfferActivity.LocalOffers.add(offer);
    }
}