public static void normalStart() {
    final java.lang.String INPUT_FILE = "datas/data.txt";
    symposium.Parser.parse(INPUT_FILE);
    symposium.DummyScheduler bs = new symposium.DummyScheduler();
    bs.makeSchedule();
    java.lang.System.out.print(Report.INSTANCE);
}