@gameLogic.Before
public void setUp() {
    gameLogic.DLLNode firstnode = new gameLogic.DLLNode(0, 0);
    gameLogic.DoublyLinkedList testList = new gameLogic.DoublyLinkedList(firstnode);
    gameLogic.DLLNode addend = new gameLogic.DLLNode(1, 3);
}