public void renderImage(com.example.velibisk.rssreader.ui.ListItem item) {
    if ((imageView) != null) {
        picasso.load(item.getImgUri()).tag(com.example.velibisk.rssreader.ui.FeedFragment.PICASSO_REQUEST_TAG).into(imageView);
    }
}