public static void main(java.lang.String[] args) {
    try {
        edu.wright.dase.CombineOntology.initOWLAPI();
        edu.wright.dase.CombineOntology.runOneByOne();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}