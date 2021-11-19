public void insert(Domain domain) {
    if ((head) == null)
        head = new DomainNode(domain);
    else {
        DomainNode temp = new DomainNode(domain);
        temp.setNext(head);
        head = temp;
    }
}