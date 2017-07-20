package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import spitter.Spitter;
import spitter.data.SpitterRepository;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register" ,method=GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value="/register",method=POST)
    public String processRegistration(@Valid Spitter spitter,Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/"+spitter.getUsername();

    }


}
