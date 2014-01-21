package video.dao;

import org.springframework.stereotype.Repository;
import video.model.Movie;

import java.util.List;

@Repository
public class MovieDao extends BaseDao {

    @SuppressWarnings("unchecked")
    public List<Movie> getMovies() {
        return getSession()
            .createCriteria(Movie.class)
            .list();
    }
}
