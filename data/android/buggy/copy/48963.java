@java.lang.Override
public void resetLinearView() {
    linearView = org.nd4j.linalg.factory.Nd4j.createComplex(data, new int[]{ 1 , length }, stride(), offset());
}