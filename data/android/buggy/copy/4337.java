@java.lang.Override
public void setFactForUnknown(org.experts.bayes.guesser.bayes.Fact fact) {
    net.clearEvidence(fact.getNodeId());
    net.updateBeliefs();
}