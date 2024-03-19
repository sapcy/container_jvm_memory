package sapcy.jvmmemory.ctr;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sapcy.jvmmemory.domain.Burger;
import sapcy.jvmmemory.service.BurgerService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BurgerController {

    private final BurgerService burgerService;

    @GetMapping("")
    public String getBurgerPage(Model model) {

        List<Burger> burgers = burgerService.getBurgers();

        model.addAttribute("burgers", burgers);

        return "index";
    }

}
