@java.lang.Override
public boolean update(int bookId, java.lang.String bookUser, java.lang.String bookDepart, java.lang.String bookArrival, java.lang.String bookDepartTime, java.lang.String bookArriTime) {
    dao.update(bookId, bookUser, bookDepart, bookArrival, bookArriTime, bookArriTime);
    return true;
}