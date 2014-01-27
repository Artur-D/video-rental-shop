import config.HibernateConfig;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import video.model.Movie;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConfig.class)
@Transactional
public class HibernateConfigTest {

    @Autowired
    private SessionFactory sessionFactory;

//    @Test
//    public void retrieveAccount() {
//        Session session = sessionFactory.openSession(); // not part of a transaction, so we need to open a session manually
//        Query query = session.createQuery("from Movie a where a.id = :id")
//            .setParameter("id", 1);
//        Movie movie = (Movie) query.uniqueResult();
//        session.close();
//        assertEquals(movie.getTitle(), "test Title");
//    }
//
//    @Test
//    public void updateAccount() {
//        Session session = sessionFactory.getCurrentSession();
//        Query query = session.createQuery("from Movie a where a.id=:id")
//            .setParameter("id", 1);
//        Movie movie = (Movie) query.uniqueResult();
//        //a.setName("foo");
//    }

}