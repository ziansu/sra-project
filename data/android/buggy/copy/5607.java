public java.lang.Object deserialize(java.lang.String s) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = new java.io.FileInputStream(s);
    java.io.ObjectInputStream oin = new java.io.ObjectInputStream(fis);
    java.lang.System.out.println("I deserialize file");
    return ((java.lang.Object) (oin.readObject()));
}