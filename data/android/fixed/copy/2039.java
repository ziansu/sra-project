public void setCredibility(double credibility) {
    if ((credibility > 1) || (credibility < 0)) {
        java.lang.System.out.println("Credibility has to be between 0 and 1");
    }else {
        this.credibility = credibility;
    }
}