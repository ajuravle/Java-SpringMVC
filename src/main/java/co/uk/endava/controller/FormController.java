package co.uk.endava.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.uk.endava.model.User;

@Controller
public class FormController {
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("userForm") User user,
			BindingResult result, Model model) {
		model.addAttribute("username", user.getUsername());
	    model.addAttribute("password", user.getPassword());
		if(user.getUsername().equals("username") && user.getPassword().equals("password"))
			return "succes";
		return "fail";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView toForm(HttpServletRequest request) {
        //new ModelAndView("Test");
        //new ModelAndView("Test","modelName", "model value");
        //new ModelAndView("Test",new HashMap<String, Object>());
        return new ModelAndView("form","userForm",new User());
    }
}
