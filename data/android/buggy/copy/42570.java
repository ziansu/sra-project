public void run_gibbs() {
    java.lang.System.out.println("1 Initialize the model ...");
    initializeModel();
    java.lang.System.out.println("2 Learning and Saving the model ...");
    inferenceModel();
    if ((type) == 0)
        computePerplexity(phi);
    
}