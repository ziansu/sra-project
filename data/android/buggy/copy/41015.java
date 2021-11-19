public  addStudent(java.lang.String name) {
    boolean added;
    added = students.add(name);
    if (added == true) {
        java.lang.System.out.println("Student was successfully added.");
    }else {
        java.lang.System.out.println("Student could not be added.");
    }
}