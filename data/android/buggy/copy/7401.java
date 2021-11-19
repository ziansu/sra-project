void paintClass() {
    lastSeen = CLASS;
    removeAll();
    javax.swing.JButton courses = new javax.swing.JButton("Courses");
    courses.addActionListener(new project_rpg.GUI.CoursesListener());
    add(courses);
    java.lang.System.out.print("I'm in class!");
    updateUI();
}