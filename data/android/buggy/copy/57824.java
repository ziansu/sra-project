public void bindType(nl.fhict.happynews.android.model.Post post) {
    this.post = post;
    if (nl.fhict.happynews.android.controller.ReadingHistoryController.getInstance().postIsRead(post)) {
        itemView.setAlpha(0.3F);
    }else {
        itemView.setAlpha(1.0F);
    }
}