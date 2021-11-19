private int dofHarman(int n) {
    int dof = ((n * (n - 5)) / 2) + 1;
    if (dof < 1)
        dof = 1;
    
    return dof;
}