public java.lang.String getFortune() {
    java.lang.String fortune = "";
    java.util.Random randomGenerator = new java.util.Random();
    int randomNumber = randomGenerator.nextInt(mFortunes.length);
    fortune = randomNumber + ". ";
    return fortune;
}