@java.lang.Override
public char getColor() throws java.io.IOException {
    outToServer.writeBytes(("COLOR" + "\n"));
    java.lang.String response = inFromServer.readLine();
    return response.charAt(0);
}