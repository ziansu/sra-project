public void acceptOrRejectManuscript(final model.Manuscript paper, final boolean decision) {
    paper.setAcceptance(decision);
    return paper;
}