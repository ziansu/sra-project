public void setAnswer() {
    answer = this.userCode.getText().toString();
    answer = answer.replace("System.out.println", "print");
    answer = answer.replace("System.out.print", "print");
}