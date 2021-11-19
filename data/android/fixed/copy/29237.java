private void printSwitch() {
    Algorithm.StudyPlan newPlan = sel.switchMajor(this.from.getCourses(), "MTDT", "autumn");
    java.lang.System.out.println(newPlan);
}