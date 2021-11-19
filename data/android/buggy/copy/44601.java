@java.lang.Override
public void matrixAdded(NamedItem<IMatrice> namedMatrix) {
    java.lang.System.out.println("adding");
    matrices.add(namedMatrix);
    matrixSelector.addItem(namedMatrix);
}