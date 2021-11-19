public void dispatchPressedKey(int key) {
    java.lang.System.out.println("key was pressed");
    inputStrategy.interpretPressedKey(key, state);
}