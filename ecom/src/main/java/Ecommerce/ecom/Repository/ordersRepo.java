package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.orders;



@Repository
public interface ordersRepo extends JpaRepository<orders, Long> {
    // You can add custom query methods here if needed
}
