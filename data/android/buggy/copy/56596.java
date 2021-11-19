@org.junit.Test
public void testIsItOfficeTime_1730_pinCodeCorrect_returnTrue() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.calendar.set(2015, 2, 27, 17, 30);
    assertTrue(card.isItOfficeTime());
}