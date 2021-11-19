@java.lang.Override
public void onClick(android.view.View v) {
    mActionListener.sendAmplitudeEvent(StaticConstants.CONTENT_NEW_REVIEW_LANDED, null);
    mActionListener.loadWriteReviewDialog();
}