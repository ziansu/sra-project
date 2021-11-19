@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    bookList = com.example.charlotte.readmemore.Utils.getUserLivres();
    for (com.example.charlotte.readmemore.ListFragment.RecyclerViewFragment fragment : fragments) {
        fragment.updateBookList(bookList);
    }
}