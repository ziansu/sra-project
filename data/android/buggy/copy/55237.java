public void writeToFile() throws java.io.IOException {
    java.lang.System.out.println("Writing!");
    java.io.File outfile = new java.io.File("courseData.txt");
    java.io.FileWriter writer = new java.io.FileWriter(outfile);
    writer.write(arg0);
    writer.close();
}