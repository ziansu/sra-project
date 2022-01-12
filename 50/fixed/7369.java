public void deleteEffect(int id) {
    while ((getIndexOfEffect(id)) != (-1)) {
        status.get(getIndexOfEffect(id)).end(this);
        status.remove(getIndexOfEffect(id));
    } 
}