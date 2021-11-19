public java.util.List<pl.edu.agh.footprint.age.solution.CarbonFootprintSolution.SolutionTreeNode> getAllPreOrder() {
    java.util.List<pl.edu.agh.footprint.age.solution.CarbonFootprintSolution.SolutionTreeNode> allNodes = new java.util.LinkedList<>();
    getAllPreOrder(root, allNodes);
    return allNodes;
}