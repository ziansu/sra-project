@java.lang.Override
public void run() {
    try {
        new org.arqrifa.logica.Mensajeria().enviar(mensaje);
    } catch (javax.mail.MessagingException ex) {
        java.lang.System.out.println(ex.getMessage());
    }
}