@java.lang.Override
public boolean isAccepted(com.nika.salad.salad.VegetablePortion vegetablePortion) {
    return ((vegetablePortion.getVegetable().getCarbohydrates()) >= (minCarbohydrates)) && ((vegetablePortion.getVegetable().getCarbohydrates()) <= (maxCarbohydrate));
}