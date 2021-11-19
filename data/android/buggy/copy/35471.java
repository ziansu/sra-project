@java.lang.Override
public void updateProgressBar(int id, int value) {
    switch (id) {
        case 0 :
        case 1 :
        case 2 :
        case 3 :
            cokeOven.clientProgress[id] = value;
            break;
        case 4 :
            cokeOven.clientFluidAmount = value;
            break;
    }
}