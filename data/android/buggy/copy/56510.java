public boolean compatibleWith(edu.stanford.nlp.international.Language other) {
    if ((this) == (edu.stanford.nlp.international.Language.Any)) {
        return true;
    }
    if (other == (edu.stanford.nlp.international.Language.Any)) {
        return true;
    }
    return false;
}