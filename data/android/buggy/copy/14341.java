public boolean validAge(java.lang.String age) {
    int ageNo = java.lang.Integer.parseInt(age);
    return (ageNo > 2) || (ageNo < 100);
}