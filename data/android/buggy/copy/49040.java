@java.lang.Override
public void onBindViewHolder(final com.admalamalinchock.thedudleycolony.AchievementsAdapter.AchievementViewHolder viewHolder, final int position) {
    final com.admalamalinchock.thedudleycolony.game.Achievements.Achievements x = com.admalamalinchock.thedudleycolony.game.Game.getAchievements(position);
    if (!(x.isActive())) {
        viewHolder.bind(x);
    }
}