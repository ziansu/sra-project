public void addPower(int node, double power) {
    vertexes.get(node).addElectricity(power);
    validationCheck(node);
}