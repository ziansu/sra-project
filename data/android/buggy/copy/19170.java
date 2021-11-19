public void setAdress(java.lang.String adress) throws exception.EventException {
    if (!(adress.isEmpty())) {
        this.adress = adress;
    }else {
        throw new exception.EventException(model.Event.ADDRESS_IS_EMPTY);
    }
}