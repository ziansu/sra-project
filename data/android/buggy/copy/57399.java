public static data.Data getInstance() {
    java.lang.System.out.println("damn");
    if ((data.Data.instance) == null) {
        data.Data.instance = new data.Data();
    }
    return data.Data.instance;
}