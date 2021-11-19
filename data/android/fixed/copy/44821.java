@java.lang.Override
public void perror(java.lang.String msg) {
    if ((msg != null) && ((msg.length()) > 0)) {
        java.lang.System.out.print((msg + ": "));
    }
    java.lang.System.out.printf("%d\n", m_ErrNo);
}