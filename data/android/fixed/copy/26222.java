public static void main(java.lang.String[] args) {
    Server s = new Server(8000);
    s.readAndApply();
    s.readAndApply();
    java.lang.System.out.println(s.gamestate);
    s.close();
}