public void validateResource() {
    resource.setState(State.active);
    ((istic.gla.groupeb.flerjeco.agent.intervention.AgentInterventionActivity) (getActivity())).resourceUpdated();
    dismiss();
}