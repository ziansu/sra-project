public void cancelBadge(org.kumoricon.site.badge.BadgeView view) {
    view.clearSelection();
    view.navigateTo(BadgeView.VIEW_NAME);
    view.closeBadgeEditWindow();
}