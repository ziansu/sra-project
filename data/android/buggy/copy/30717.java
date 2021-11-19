@java.lang.Override
public boolean equals(java.lang.Object o) {
    java.lang.System.out.println(("gli oggetti sono uguali = " + (user_ip.equals(o))));
    return user_ip.equals(((it.scrs.miner.util.IP) (o)).getIp());
}