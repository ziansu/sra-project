@javax.annotation.Nonnull
@java.lang.Override
public com.mchange.v2.c3p0.ComboPooledDataSource getDataSource() {
    if (!(this.configured)) {
        this.configure();
        this.configured = true;
    }
    return this.dataSource;
}