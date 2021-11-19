public java.lang.String processMatchInfo(java.lang.String s) {
    java.lang.System.out.println(s);
    if (s.split(" ")[0].equals("action"))
        return "check";
    
    return "";
}