public static void load(java.util.Map<java.lang.String, java.lang.String> props) {
    if ((io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance) == null) {
        synchronized(io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance) {
            if ((io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance) == null) {
                io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance = new io.confluent.connect.jdbc.source.JdbcSourceTaskConfig(props);
            }
        }
    }
}