package video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import video.model.Movie;

@Controller
@RequestMapping("/welcome")
public class PageController {

    @RequestMapping(value = "index.html", method = RequestMethod.GET)
    public ModelAndView printWelcome() {

        Movie movie = new Movie();
        movie.setTitle("tytuł + Spring 3 MVC Hello World");
        return new ModelAndView("index", "movie", movie);

    }
}
