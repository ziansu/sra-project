void Declare(project.Society soc, project.Student you) {
    if ((eligible) == true) {
        return ;
    }
    eligible = true;
    soc.addToBallot(you);
}