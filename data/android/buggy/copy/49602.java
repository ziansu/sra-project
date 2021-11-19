@java.lang.Override
public void deleteMagazine(java.lang.Integer magzineId) {
    magazineRepository.delete(magzineId);
}