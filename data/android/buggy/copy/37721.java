public void renderImage(com.example.velibisk.rssreader.ui.ListItem item) {
    if (com.example.velibisk.rssreader.Util.isEmpty(item.getImgUri())) {
        return ;
    }
    picasso.load(item.getImgUri()).tag(com.example.velibisk.rssreader.ui.FeedFragment.PICASSO_REQUEST_TAG).into(imageView);
}