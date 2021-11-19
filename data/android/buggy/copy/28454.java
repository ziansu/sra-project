public static Node getNode(int id) {
    for (java.util.Map.Entry<java.lang.Integer, Node> n : Application.nodes.entrySet()) {
        if ((n.getKey()) == id)
            return n.getValue();
        
    }
    return null;
}