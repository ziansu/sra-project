private int dofHarman(int n) {
    int dof = ((n * (n - 5)) / 2) + 1;
    if (dof < 0)
        dof = 0;
    
    return dof;
}