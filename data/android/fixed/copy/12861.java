public void doAddComputer() {
    this.computerGateway.create(new es.uvigo.esei.infraestructura.entities.Computer(getLaboratory(), getComputerNum(), getLabelNum()));
    this.computerGateway.save();
}