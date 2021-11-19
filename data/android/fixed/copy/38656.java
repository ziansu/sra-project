public void familyGreeting() {
    java.lang.System.out.println(this.name);
    if ((this.child) != null) {
        this.child.familyGreeting();
    }
}