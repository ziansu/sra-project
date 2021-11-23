public amagi82.modularcharactersheetcreator.entities.characters.Splat getSplat(int position) {
    amagi82.modularcharactersheetcreator.entities.characters.Splat splat = axisViewModel.getList().get(position).getSplat();
    updateIfNotEndpoint(splat);
    return splat;
}