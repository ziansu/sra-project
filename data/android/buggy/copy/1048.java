public void setEvaluate(java.lang.Integer evaluate) {
    try {
        if ((evaluate < 0) || (evaluate > 5))
            java.lang.System.out.println("Opa! a avaliação deve ser de 0 a 5");
        else
            this.evaluate = evaluate;
        
    } catch (java.lang.NumberFormatException exception) {
    }
}