@java.lang.Override
public void run() {
    try {
        com.core.util.LuceneUtil.indexWriter.close();
        com.core.util.LuceneUtil.indexReader.close();
        java.lang.System.out.println("关闭索引");
    } catch (java.lang.Exception e) {
        new java.lang.RuntimeException(e);
    }
}