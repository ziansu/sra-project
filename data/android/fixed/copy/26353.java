public boolean doGreet() {
    return (java.lang.Integer.parseInt(Setting.NEVERGREET.get(this))) != 1;
}