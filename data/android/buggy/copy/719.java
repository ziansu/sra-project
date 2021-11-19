@org.junit.Test
public void testOneElementArray() {
    int[] array = new int[]{ 3 };
    int distance = 3;
    int result = frogRiverOne.solution(distance, array);
    assertTrue((result == 0));
}