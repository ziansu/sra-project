public static void Tro(int[] a, int[] p) {
    java.lang.System.out.println("Tro() CALLED!!!");
    timeManager.calcTimeSlice(p);
    scheduler.schedule(a, p);
    dispatcher.dispatch(a, p);
}