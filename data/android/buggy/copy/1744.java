public void addStudentToSmallestSection(defPackage.Person p) {
    defPackage.Section section = db.sectionDB.getSmallestSection(this.classroomID);
    if (section == null) {
        java.lang.System.out.println("THERE IS NO SECTION!!!");
        return ;
    }
    section.addStudentToSection(p.getEmail());
}