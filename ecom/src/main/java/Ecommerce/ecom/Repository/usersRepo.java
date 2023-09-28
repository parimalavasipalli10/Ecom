package Ecommerce.ecom.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.Users;

@Repository
public interface usersRepo extends JpaRepository<Users, Long> {
	@Query("SELECT u FROM Users u WHERE u.user_Email = :user_Email")
    Optional<Users> findByUser_Email(@Param("user_Email") String user_Email);
}
