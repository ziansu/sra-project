public static void main(java.lang.String[] args) throws java.io.IOException {
    cn.edu.bit.linc.zql.ZQLContext zqlContext = new cn.edu.bit.linc.zql.ZQLContext();
    cn.edu.bit.linc.uniformsql.jdbc.shell.Shell shell = new cn.edu.bit.linc.uniformsql.jdbc.shell.Shell();
    shell.parseArgs(args);
    shell.doInputSQLCommand();
}