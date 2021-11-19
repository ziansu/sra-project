@java.lang.Override
public com.jeremy.exercise.moudle.Floorplan savaToRepository() {
    return objectTranslate(com.jeremy.exercise.Repository.FloorplanRepository.save(this.toJson()));
}