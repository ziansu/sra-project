@org.junit.Test
public void returnsTheOddNumberZeroWhenAllOtherNumbersAreEven() {
    com.malsr.codewars.FindParityOutlier parityOutlier = new com.malsr.codewars.FindParityOutlier();
    int[] numbersToFind = new int[]{ 0 , 2 , 4 , 6 };
    assertEquals("", 0, parityOutlier.find(numbersToFind));
}