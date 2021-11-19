private void waitForParserToFinish(java.lang.Thread parser) {
    if (parser != null) {
        try {
            parser.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}