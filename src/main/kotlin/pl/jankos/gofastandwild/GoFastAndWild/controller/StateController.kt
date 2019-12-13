package pl.jankos.gofastandwild.GoFastAndWild.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StateController
{
    @GetMapping("/")
    fun getCurrentSpots() spots: String[] {

}
}
