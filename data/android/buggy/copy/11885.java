public void acceptOrRejectManuscript(final model.Manuscript paper, final java.lang.String decision) {
    paper.setAcceptance(decision);
    return paper;
}