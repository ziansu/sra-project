public void addTransition(de.teck.statemachine.persistence.model.Transition transition) {
    transitions.add(transition);
    if ((transition.getTransitionGraph()) != (this)) {
        transition.setTransitionGraph(this);
    }
}