@java.lang.Override
public void run() {
    try {
        new org.arqrifa.logica.Mensajeria().enviar(new org.arqrifa.datatypes.DTMensaje(destinatario, asunto, mensaje));
    } catch (javax.mail.MessagingException ex) {
        java.lang.System.out.println(ex.getMessage());
    }
}