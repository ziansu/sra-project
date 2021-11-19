@org.testng.annotations.AfterClass(alwaysRun = true)
public void close() throws java.lang.Exception {
    try {
        h2QueryRunner.close();
    } finally {
        queryRunner.close();
    }
}