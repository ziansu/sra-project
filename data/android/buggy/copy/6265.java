public static void clean() {
    for (java.lang.String c : br.sense.model.MessageArray.cSensor)
        c = "";
    
    br.sense.model.MessageArray.msgTemporalLine = new int[20];
    br.sense.model.MessageArray.msg = new br.sense.model.Message[50];
}