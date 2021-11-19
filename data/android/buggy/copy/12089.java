public void loadAnswer(int row) {
    java.lang.System.out.println(row);
    java.util.Map<java.lang.String, java.lang.Object> at = this.userAttempts.get(row);
    java.lang.System.out.println(at.get("answer"));
}