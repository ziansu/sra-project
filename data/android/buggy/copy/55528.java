public void removeItem(com.quartzodev.data.BookApi bookApi) {
    if ((mBookList) != null) {
        mBookList.remove(bookApi);
        notifyDataSetChanged();
        updateAdapterParent();
    }
}