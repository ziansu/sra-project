@java.lang.Override
public void train(data.ClassifiedData data) {
    java.util.Vector x = data.asVector();
    modifyNetwork(((data.getClassId()) - 1), calculateOutput(x), x);
}