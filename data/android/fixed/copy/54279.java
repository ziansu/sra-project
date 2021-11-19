public int replaceManuscript(model.Manuscript theManuscript, model.Manuscript theReplacement) {
    if ((removeManuscript(theManuscript)) == 0) {
        submitManuscript(theReplacement);
        return 0;
    }
    return -1;
}