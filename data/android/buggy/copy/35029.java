public listaexercicio5.Disciplina getDisciplinasCursadas(int n) {
    if (n <= (qtde_disciplinas)) {
        return this.disciplinas_cursadas[n];
    }
    return null;
}