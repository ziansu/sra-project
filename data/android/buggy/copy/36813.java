public static void Tro(int[] a, int[] p) {
    java.lang.System.out.println("Tro() CALLED!!!");
    scheduler.schedule(a, p);
    dispatcher.dispatch(a, p);
    timeManager.calcTimeSlice(p);
}