public static void viewBlogStats(android.content.Context context, org.wordpress.android.fluxc.model.SiteModel site) {
    if (site == null)
        return ;
    
    android.content.Intent intent = new android.content.Intent(context, org.wordpress.android.ui.stats.StatsActivity.class);
    intent.putExtra(WordPress.SITE, site);
    context.startActivity(intent);
}