public elevator.Person generatePerson() {
    java.util.Random randGen = new java.util.Random(java.lang.System.currentTimeMillis());
    elevator.Person person = new elevator.Person(0, ((Config.maxFloor) - 1));
    return person;
}