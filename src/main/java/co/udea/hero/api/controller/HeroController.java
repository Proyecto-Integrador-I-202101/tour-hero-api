package co.udea.hero.api.controller;

import co.udea.hero.api.model.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    public HeroController() {
    }

    @GetMapping()
    public Hero getHero(){
        return new Hero(1, "Super-Man");
    }
}
