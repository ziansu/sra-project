public java.util.List<org.w3c.dom.Node> visitDot(DotContext ctx, org.w3c.dom.Node n) {
    java.util.List<org.w3c.dom.Node> ret = new java.util.ArrayList<>();
    ret.add(n);
    java.lang.System.out.println("inside dot?");
    return ret;
}