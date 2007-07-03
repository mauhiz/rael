package net.mauhiz.rael.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author mauhiz
 * 
 */
public class HibernateUtils {
    /**
     * 
     */
    private static Configuration  conf;

    /**
     * 
     */
    private static SessionFactory sessFact;
    static {
        clearConfig();
    }

    /**
     * 
     */
    public static void clearConfig() {
        conf = new Configuration().configure();
    }

    /**
     * ferme la session.
     * 
     * @param session
     */
    public static void closeSession(final org.hibernate.Session session) {
        session.getTransaction().commit();
        session.close();
    }

    /**
     * Returns {@link #conf}.
     * 
     * @return the conf
     */
    public static Configuration getConf() {
        return conf;
    }

    /**
     * @return un sessionFactory
     */
    protected static SessionFactory getSessionFactory() {
        synchronized (HibernateUtils.class) {
            if (null == sessFact) {
                conf.setProperty("current_session_context_class", "thread");
                sessFact = conf.buildSessionFactory();
            }
            return sessFact;
        }
    }

    /**
     * @return une session
     */
    public static org.hibernate.Session initSession() {
        final org.hibernate.Session session = getSessionFactory().openSession();
        session.beginTransaction();
        return session;
    }

}
