package springinaction.tacocloud.data;


import org.springframework.data.repository.CrudRepository;
import springinaction.tacocloud.Ingredient;

public interface IngredientRepository
         extends CrudRepository<Ingredient, String> {
  
}
