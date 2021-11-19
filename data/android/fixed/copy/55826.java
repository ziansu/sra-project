public static void main(java.lang.String[] args) {
    hw4.GraphModel model = new hw4.GraphModel();
    hw4.GraphView view = new hw4.GraphView(model);
    model.addObserver(view);
}