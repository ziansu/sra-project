public void setMysql(com.Ben12345rocks.AdvancedCore.mysql.MySQL mysql) {
    if ((this.mysql) != null) {
        this.mysql.close();
    }
    this.mysql = mysql;
}