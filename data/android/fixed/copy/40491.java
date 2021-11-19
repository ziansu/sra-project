private void getExclusions(uk.co.hmtt.gym.app.repository.UserActivity booking) {
    if (booking != null) {
        final java.util.List<uk.co.hmtt.gym.app.model.Exclusion> exclusions = userActivity.getExclusions(booking);
        booking.setExclusions(new java.util.HashSet(exclusions));
    }
}