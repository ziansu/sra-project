boolean isMatchedWith(Student s, Lecturer l) {
    if ((studentsProject.get(s)) == null)
        return false;
    
    return studentsProject.get(s).getLecturer().equals(l);
}