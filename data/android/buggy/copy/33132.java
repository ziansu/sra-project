public Item sample() {
    queues.RandomizedQueue<Item>.Node qNode = random();
    if (qNode == (first))
        return first.item;
    else
        return qNode.next.item;
    
}