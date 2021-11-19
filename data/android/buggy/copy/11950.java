@java.lang.Override
public nu.yona.app.ui.challenges.TimeZoneGoalViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layoutView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.timezoen_goal_item_layout, null);
    nu.yona.app.ui.challenges.TimeZoneGoalViewHolder rHolder = new nu.yona.app.ui.challenges.TimeZoneGoalViewHolder(layoutView, clickListener);
    return rHolder;
}