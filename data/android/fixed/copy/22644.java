private void onCollectionClicked(java.lang.Long collectionId) {
    android.content.Intent intent = new android.content.Intent(this, com.shopify.sample.activity.ProductListActivity.class);
    if (collectionId != null) {
        intent.putExtra(ProductListActivity.EXTRA_COLLECTION_ID, collectionId);
    }
    startActivity(intent);
}