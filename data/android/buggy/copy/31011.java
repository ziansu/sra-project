public void update(com.wsb.biz.entity.Customer customer, java.util.List<com.wsb.biz.entity.Car> cars) {
    this.update(customer);
    com.wsb.biz.service.CarBO.getCarBO().update(cars, customer.getId());
}