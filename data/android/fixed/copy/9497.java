@org.springframework.web.bind.annotation.RequestMapping(value = "/updateFoodDetail", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.vtth.food.entity.TblFooddetail updateFood(@org.springframework.web.bind.annotation.RequestBody
com.vtth.food.entity.TblFooddetail foodDetail, javax.servlet.http.HttpSession session) {
    com.vtth.food.entity.TblFooddetail newFoodDetail = foodDetailService.updateFoodDetail(foodDetail);
    return newFoodDetail;
}