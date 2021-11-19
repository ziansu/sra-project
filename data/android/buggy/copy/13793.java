public void run() {
    try {
        new main.java.ru.innopolis.itcources.lab1.SumCounting(fileNameIn, countThread);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}