@java.lang.Override
public void updatePrgoramStatus(int programId, boolean isDisabled) {
    gov.va.escreening.entity.Program program = programRepository.findOne(programId);
    program.setIsDisabled(isDisabled);
    programRepository.update(program);
    programRepository.commit();
}