public void setOntologyNetwork(edu.umich.med.mbni.lkq.cyontology.internal.model.OntologyNetwork newOntologyNetwork) {
    if (newOntologyNetwork != (curOntologyNetwork)) {
        curOntologyNetwork = newOntologyNetwork;
        edu.umich.med.mbni.lkq.cyontology.internal.event.OntologyNetworkChangedEvent event = new edu.umich.med.mbni.lkq.cyontology.internal.event.OntologyNetworkChangedEvent(this, curOntologyNetwork, newOntologyNetwork);
        fireOntologyNetworkChangedEvent(event);
    }
}