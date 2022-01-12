public double cost(main.logic.Route r) {
    return ((r.getPricePerGramTransport()) * (weight)) + ((r.getPricePerVolumeTransport()) * (volume));
}