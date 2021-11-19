@br.com.caelum.vraptor.Post(value = "salvar")
public void salvar(avalie.models.Professor professor) {
    professorDAO.salvar(professor);
    result.include("msg", "Professor Salvo");
    result.redirectTo(avalie.controllers.ProfessorController.class).novo();
}