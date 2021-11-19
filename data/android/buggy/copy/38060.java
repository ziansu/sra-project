@java.lang.Override
public void run() {
    commands.stop();
    packets.stop();
    con.close();
}