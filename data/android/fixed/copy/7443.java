@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void cancelBookTour(int idBT) {
    this.bookTourDao.cancelBookTour(idBT);
}