package sapcy.jvmmemory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sapcy.jvmmemory.domain.Burger;

public interface BurgerRepository extends JpaRepository<Burger, Long> {



}
