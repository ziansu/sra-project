public static boolean getFixQualEnc(org.apache.hadoop.conf.Configuration conf) {
    java.lang.String s = conf.get(be.ugent.intec.halvade.utils.HalvadeConf.fixQualEnc);
    if (s.equalsIgnoreCase("true"))
        return true;
    else
        return false;
    
}