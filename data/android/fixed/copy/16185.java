public boolean isValidContribution(java.lang.String contribution) {
    if (contribution != null) {
        return (this.wordCount(contribution)) <= 100 ? true : false;
    }
    return true;
}