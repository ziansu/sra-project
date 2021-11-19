@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder baseViewHolder, com.scnu.nita22.androidrss.weekly.WeeklyData weeklyData) {
    baseViewHolder.setText(R.id.weekly_title, weeklyData.getTitle());
    baseViewHolder.setText(R.id.weekly_date, ((weeklyData.getPublishTime()) + "发布"));
}