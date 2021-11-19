private com.oracle.truffle.r.nodes.builtin.base.Order.OrderVector1Node initOrderVector1() {
    if ((orderVector1Node) == null) {
        orderVector1Node = insert(com.oracle.truffle.r.nodes.builtin.base.OrderNodeGen.OrderVector1NodeGen.create());
    }
    return orderVector1Node;
}