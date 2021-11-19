public boolean search(char i) {
    cpe200.week2.PNode currentNode = head;
    while (currentNode != null) {
        if ((currentNode.data) == i)
            return true;
        
        currentNode = currentNode.next;
    } 
    return false;
}