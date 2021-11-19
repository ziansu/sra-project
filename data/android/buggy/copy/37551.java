@java.lang.Override
public void remove(salvo.jesus.graph.Vertex v) throws java.lang.Exception {
    for (int iCnt = 0; iCnt < (UnderlyingGraphs.length); iCnt++) {
        UnderlyingGraphs[iCnt].remove(v);
    }
}