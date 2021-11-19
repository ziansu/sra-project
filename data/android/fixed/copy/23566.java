@java.lang.Override
public void setup(hashJoin.Context context) {
    org.apache.hadoop.conf.Configuration conf = context.getConfiguration();
    delim = conf.get("delimiter");
    hashJoin.MRHashJoin.HashJoinReducer.hmap = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>();
}