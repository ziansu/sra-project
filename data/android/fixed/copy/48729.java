public void logBuyFrom(mas.cv4.DFAgentDescription agent, mas.cv4.Offer offer, boolean accepted) {
    traders.get(agent).logBuyFrom(offer, accepted);
}