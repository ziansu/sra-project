@java.lang.Override
public java.lang.String getQuote() {
    int index = random.nextInt(((quotes.size()) - 1));
    return quotes.get(index);
}