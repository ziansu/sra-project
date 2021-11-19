public java.util.List<it.unical.mat.embasp.languages.pddl.Action> getActions() {
    parse();
    return java.util.Collections.unmodifiableList(actionSequence);
}