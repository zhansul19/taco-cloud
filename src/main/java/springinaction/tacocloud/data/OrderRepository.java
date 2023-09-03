package springinaction.tacocloud.data;

import org.springframework.data.repository.CrudRepository;

import springinaction.tacocloud.TacoOrder;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, Long> {

}
