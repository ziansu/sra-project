@org.junit.Test
public void testContainsAce() {
    hand.addCardToHand(card1);
    hand.addCardToHand(card3);
    junit.framework.Assert.assertEquals(true, hand.containsAce());
}