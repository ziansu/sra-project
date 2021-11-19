public void run() {
    while (true) {
        try {
            java.lang.String instruction = in.readUTF();
            int result = executeInstruction(instruction);
            returnMessages(result);
        } catch (java.io.IOException e) {
        }
    } 
}