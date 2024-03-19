package sapcy.jvmmemory.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sapcy.jvmmemory.dao.BurgerRepository;
import sapcy.jvmmemory.domain.Burger;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BurgerService {

    private final BurgerRepository burgerRepository;

    public List<Burger> getBurgers() {
        return burgerRepository.findAll();
    }

    public String createBurgers(int num) {
        List<Burger> burgers = new ArrayList<>();

        for (int i=0; i<num; i++) {
            Burger burger = new Burger("burger-" + i, i, i, i, i);
            burgers.add(burger);
        }

        burgerRepository.saveAll(burgers);

        burgers.clear();
        return "200";
    }

}
