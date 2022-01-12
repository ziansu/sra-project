public static void main(java.lang.String[] args) throws java.lang.CloneNotSupportedException {
    RootedTree tree1 = new RootedTree(10000);
    RootedTree tree2 = new RootedTree(tree1);
    java.lang.System.out.println(AHUalgorithm.getResult(tree1, tree2));
}