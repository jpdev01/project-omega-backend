package onroad.backend.service;

import onroad.backend.entity.Category;
import onroad.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService(){}

    public void save(Category category)
    {
        if (category != null) {
            try
            {
                categoryRepository.save(category);
            }
            catch (Exception e)
            {
                System.err.println("erro ao salvar novo produto!");
            }
        }
    }

    public Optional<Category> findById(Integer id)
    {
        return categoryRepository.findById(id);
    }

    public List<Category> findAll()
    {
        return categoryRepository.findAll();
    }
}
