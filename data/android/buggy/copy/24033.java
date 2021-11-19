public int ev4(int p) {
    position = p;
    java.lang.System.out.println("You encountered a squirrel, it tricked you and stole your shoe, your speed has been diminished");
    speed -= 1;
    position += speed;
    u.close();
    return position;
}