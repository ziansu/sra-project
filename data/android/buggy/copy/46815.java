public void testLauncherConvertArrayToList() {
    int[] values = new int[]{ 0 , 1 , 2 , 4 };
    listStart = ArrayUtilities.intArrayToList(values);
    listStart.printList();
}