@com.jaeksoft.searchlib.Option
@com.jaeksoft.searchlib.LongSwitch(value = "httpPort")
@com.jaeksoft.searchlib.ShortSwitch(value = "p")
@com.jaeksoft.searchlib.SingleArgument
public void setHttpPort(java.lang.String port) {
    this.httpPort = (org.apache.commons.lang3.StringUtils.isEmpty(port)) ? null : java.lang.Integer.parseInt(port);
}