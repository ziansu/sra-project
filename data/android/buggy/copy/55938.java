public static void write(io.writer.MLAWord word) {
    io.writer.Csv.writer.writeNext(word.rawWith(new java.lang.String[]{ "author" }));
    try {
        io.writer.Csv.writer.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}