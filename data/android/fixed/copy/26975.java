public java.util.List<it.unical.mat.embasp.languages.pddl.Action> getActions() {
    if ((actionSequence) == null) {
        actionSequence = new java.util.ArrayList<>();
        parse();
    }
    return java.util.Collections.unmodifiableList(actionSequence);
}