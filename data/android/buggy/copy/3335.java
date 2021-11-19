public void delete() {
    rabbitArrayList.set(((rabbitArrayList.size()) - 1), null);
    rabbitArrayList.trimToSize();
    (sum)--;
}