
package com.ks.kidStore.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.ks.Users.UserEntity;

public interface UserRepository extends JpaRepository<User, Long> {
   
}
