void bindNewDetails() {
    textView.setText(arrayList.get(currentPosition).getDescription());
    initializePlayer(android.net.Uri.parse(arrayList.get(currentPosition).getVideoURL()));
}