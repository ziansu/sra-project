@br.mackenzie.lfs.crud_spring_hibernate.controllers.RequestMapping(value = "/add", method = RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView addBookProcess(@br.mackenzie.lfs.crud_spring_hibernate.controllers.ModelAttribute
br.mackenzie.lfs.crud_spring_hibernate.model.Book book) {
    bookService.addBook(book);
    return new org.springframework.web.servlet.ModelAndView("redirect:/book/add");
}