package video.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDao {

    private static final SessionFactory SESSION_FACTORY = new Configuration()
        .configure() // configures settings from hibernate.cfg.xml
        .buildSessionFactory();

    public BaseDao() {

    }

    public Session getSession() {
        return SESSION_FACTORY.getCurrentSession();
    }
}
