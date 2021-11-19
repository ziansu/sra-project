@org.greenrobot.eventbus.Subscribe
public void onGalleryEvent(com.collage.util.events.GalleryEvent galleryEvent) {
    this.currentFriend = galleryEvent.getFriend();
    galleryPresenter.populatePhotosList(currentFriend);
    noFriendSelectedTextView.setVisibility(View.GONE);
}