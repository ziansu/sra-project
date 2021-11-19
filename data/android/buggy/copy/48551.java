public void add(com.luxoft.wheretogo.models.Event event) {
    if ((findByName(event.getName())) == null) {
        super.add(event);
    }
    super.update(event);
}