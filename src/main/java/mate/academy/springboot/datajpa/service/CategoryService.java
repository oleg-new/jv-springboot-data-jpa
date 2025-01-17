package mate.academy.springboot.datajpa.service;

import mate.academy.springboot.datajpa.model.Category;

public interface CategoryService {
    Category save(Category category);

    Category get(Long id);

    Category update(Long id, Category category);

    void delete(Long id);
}
