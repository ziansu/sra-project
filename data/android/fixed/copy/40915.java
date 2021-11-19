protected android.content.Intent addDestinationIntent(com.indragie.cmput301as1.Destination destination) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(com.indragie.cmput301as1.DestinationAddActivity.EXTRA_DESTINATION, destination);
    return intent;
}