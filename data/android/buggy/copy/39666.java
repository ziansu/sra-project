public java.util.ArrayList<dataModel.AnnotationGeneral> RunGeneral() {
    java.lang.System.out.println("run general");
    java.util.ArrayList<dataModel.AnnotationGeneral> ann_gen = new java.util.ArrayList<dataModel.AnnotationGeneral>();
    ann_gen = this.Document.CreateGeneral();
    java.lang.System.out.println("ann general");
    return ann_gen;
}