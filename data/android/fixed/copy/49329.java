public void Display() {
    Linked_List.Node display = first;
    for (int i = 0; i < (nodeCount); i++) {
        java.lang.System.out.print(display.info.toString());
        display = display.next;
    }
    java.lang.System.out.print("\n");
}