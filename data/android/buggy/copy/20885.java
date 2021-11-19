public static com.example.booker.MyBook newInstance(int page) {
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.example.booker.MyBook.ARG_PAGE, page);
    com.example.booker.MyBook myBook = new com.example.booker.MyBook();
    myBook.setArguments(args);
    return myBook;
}