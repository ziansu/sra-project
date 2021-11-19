public void insert(com.example.florasphere.Plant plant) {
    com.example.florasphere.PlantListSingleton.instance.plantlist[plant_list_size] = plant;
    (plant_list_size)++;
}