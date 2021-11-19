public static void main(java.lang.String[] args) {
    java.lang.System.out.println("ROMBI Control Program v0.1.0");
    java.lang.System.out.println("Beginning Submarine Setup");
    Sub.Rombi rombi = new Sub.Rombi();
    java.lang.System.out.println("Submarine Setup Complete. Beginning main control program.");
    Control.ConsoleUI.run(rombi);
}