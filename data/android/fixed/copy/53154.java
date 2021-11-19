@java.lang.Override
public java.lang.String getQuote() {
    int index = random.nextInt(quotes.size());
    return quotes.get(index);
}