public elevator.Person generatePerson() {
    java.util.Random randGen = new java.util.Random(java.lang.System.currentTimeMillis());
    elevator.Person person = new elevator.Person(0, randGen.nextInt(Config.maxFloor));
    return person;
}