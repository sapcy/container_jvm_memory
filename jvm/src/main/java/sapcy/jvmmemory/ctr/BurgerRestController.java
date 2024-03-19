package sapcy.jvmmemory.ctr;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import sapcy.jvmmemory.domain.Burger;
import sapcy.jvmmemory.service.BurgerService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BurgerRestController {

    private final BurgerService burgerService;

    @GetMapping("/burger/{num}")
    @ResponseBody
    public String createBurgers(@PathVariable("num") int num) {

        burgerService.createBurgers(num);

        List<Burger> burgers = burgerService.getBurgers();

        return "200";

    }

}
