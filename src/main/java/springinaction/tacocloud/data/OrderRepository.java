package springinaction.tacocloud.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import springinaction.tacocloud.TacoOrder;
import springinaction.tacocloud.Users;

import java.util.List;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUsersOrderByPlacedAtDesc(
            Users users, Pageable pageable);
}
