public void addReviewer(models.User user) {
    if (this.reviewers.add(user)) {
        this.update();
    }
}