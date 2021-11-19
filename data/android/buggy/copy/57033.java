private void setAuthorList(org.springframework.ui.Model model) {
    java.util.ArrayList<com.springapp.mvc.model.Author> authors = com.google.common.collect.Lists.newArrayList(authorRepository.findAll());
    authors.add(0, new com.springapp.mvc.model.Author());
    model.addAttribute("authorList", authors);
}