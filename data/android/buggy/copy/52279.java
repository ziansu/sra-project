public org.springframework.core.io.Resource getResource() throws java.io.IOException {
    org.springframework.core.io.Resource res = resourceLoader.getResource("classpath:data/DataDump_mysql.txt");
    java.lang.System.out.println(java.util.Arrays.toString(res.getFile().list()));
    return res;
}