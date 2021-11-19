private int positionToX(int position) {
    return position < (pokinboroda.andriy.com.foxhunting.model.GameModel.AREA_DIMENSION) ? position : position % (pokinboroda.andriy.com.foxhunting.model.GameModel.AREA_DIMENSION);
}