public final void close() throws java.sql.SQLException {
    scouter.agent.trace.TraceSQL.rsclose(this);
    this.inner.close();
}