package video.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import video.dao.MovieDao;
import video.model.Movie;

import java.util.List;

@Service
public class UserService {

    @Autowired
    MovieDao movieDao;

    public List<Movie> getAllMovies() {
        return movieDao.getMovies();
    }
}
