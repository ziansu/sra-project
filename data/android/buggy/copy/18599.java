public void setProgress(int progress) {
    android.content.Context context = itemView.getContext();
    java.lang.String tips = context.getString(R.string.card_progress_caption_tips, progress);
    mBinding.progressCaptionTips.setText(tips);
    mBinding.progressMeter.setProgressValue(progress);
}