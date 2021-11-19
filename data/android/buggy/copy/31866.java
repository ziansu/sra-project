protected double childTopicInDocProb(int tid, structures._ChildDoc d) {
    double docLength = d.m_parentDoc.getDocInferLength();
    double smoothingParameter = 1.0E-20;
    return ((d.m_parentDoc.m_sstat[tid]) + smoothingParameter) / docLength;
}