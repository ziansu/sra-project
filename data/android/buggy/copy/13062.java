private java.lang.Boolean validateTimex(caevo.Timex timex) {
    java.lang.String val = timex.getValue();
    java.util.regex.Matcher m = valQuarter.matcher(val);
    if (!(m.matches()))
        return true;
    else
        return false;
    
}