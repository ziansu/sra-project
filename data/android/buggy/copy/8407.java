public void setListObjects(java.util.List<com.golub.golubroman.megakittest.Cars.CarModel> carModels) {
    if ((this.carModels.size()) > 0)
        this.carModels.clear();
    
    this.carModels = carModels;
    notifyDataSetChanged();
}