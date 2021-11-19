private void printSwitch() {
    Algorithm.StudyPlan newPlan = sel.switchMajor(this.from.getCourses(), "MTDT", "autumn", 2);
    java.lang.System.out.println(newPlan);
}