public void Draw() {
    for (branchAW.CardField cf : aFields) {
        java.lang.System.out.println(cf.toString());
        cf.Draw(this);
    }
}