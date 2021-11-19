public void print_arr_local_time() {
    org.joda.time.format.DateTimeFormatter dtfOut = org.joda.time.format.DateTimeFormat.forPattern("yyyy/MM/dd/hh:mm:ss a");
    java.lang.System.out.print(dtfOut.print(this.get_arr_time_local()));
}