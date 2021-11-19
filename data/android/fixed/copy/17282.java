protected java.lang.String playRound(io.zipcoder.zealotscasino.Card playersCard, io.zipcoder.zealotscasino.Card dealersCard) {
    io.zipcoder.zealotscasino.UserInput.display(("Your Card: " + playersCard));
    io.zipcoder.zealotscasino.UserInput.display(("Dealer's Card: " + dealersCard));
    return determineOutcome(evaluateCardValue(playersCard), evaluateCardValue(dealersCard));
}