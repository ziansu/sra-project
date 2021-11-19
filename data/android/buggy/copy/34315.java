public boolean shouldAccept(mas.cv4.Offer offer, java.util.List<mas.cv4.Goal> goals, double profit) {
    return profit > (calculateMinimumPriceFor(offer.getBooks(), goals));
}