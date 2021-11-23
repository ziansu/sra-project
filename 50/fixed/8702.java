protected int evaluateCardValue(io.zipcoder.zealotscasino.Card theCard) {
    return (Card.CardValue.valueOf(theCard.getFaceValue()).ordinal()) + 2;
}