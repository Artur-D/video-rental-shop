package video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import video.model.Movie;
import video.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class MovieController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "index.html", method = RequestMethod.GET)
    public ModelAndView printMovies() {
        List<Movie> movies = userService.getAllMovies();
        return new ModelAndView("moviesList", "movie", movies);
    }
}
