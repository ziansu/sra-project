public void messageArrived(java.lang.String msg) {
    java.lang.System.out.println(("Message received: " + msg));
    java.lang.System.out.println("For the life of me can't get it to print onto the Text Area because what the fuck is Swing even, how does this even work, what is this");
    textArea.append(java.lang.String.format((msg + "%n")));
}