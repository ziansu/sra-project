@java.lang.Override
protected void printQueryString(S statement, com.datastax.driver.core.StatementFormatter.StatementWriter out, com.datastax.driver.core.StatementFormatter.StatementFormatVerbosity verbosity) {
    out.append(com.datastax.driver.core.StatementFormatter.StatementWriter.queryStringStart);
    out.appendQueryStringFragment(statement.getQueryString(out.getCodecRegistry()));
    out.append(com.datastax.driver.core.StatementFormatter.StatementWriter.queryStringEnd);
}