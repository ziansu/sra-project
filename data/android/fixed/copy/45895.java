protected java.util.HashMap search(java.util.HashMap parameters) throws java.lang.Exception {
    java.lang.String result = this.commonSearchByAttributes(parameters);
    java.util.HashMap a = new java.util.HashMap();
    java.lang.System.out.println(result);
    conversion(result);
    this.convertFHIR();
    return a;
}