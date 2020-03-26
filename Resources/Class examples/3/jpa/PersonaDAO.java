/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.jpa;

import herencia.entidades.PersonaEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author sdelaot
 */
public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO( String nombreBD ) {
        emf = Persistence.createEntityManagerFactory("$objectdb/db/" + nombreBD);
        em = emf.createEntityManager();
    }
    
    public void create( PersonaEntity pe ) {
        em.getTransaction().begin();
        em.persist(pe);
        em.getTransaction().commit();
    }
    public PersonaEntity read( Long id ) {
        Query query = em.createQuery("SELECT pe FROM PersonaEntity pe WHERE pe.idPersona=" + id);
        PersonaEntity pe = (PersonaEntity)query.getSingleResult();
        return pe;
    }
    public PersonaEntity read( PersonaEntity pe ) {
//        Query query = em.createQuery("SELECT pe FROM PersonaEntity pe WHERE pe.idPersona=" + pe.getIdPersona());
//        pe = (PersonaEntity)query.getSingleResult();
        return read( pe.getIdPersona() );
    }
    public List<PersonaEntity> readAll() {
        TypedQuery<PersonaEntity> query =
        em.createQuery("SELECT pe FROM PersonaEntity pe", PersonaEntity.class);
        List<PersonaEntity> results = query.getResultList();
        return results;
    }
    public void udpate( PersonaEntity pe ) {
        PersonaEntity peTemp = read( pe.getIdPersona() );
        peTemp.setNombre( pe.getNombre() );
        peTemp.setCorreoE( pe.getCorreoE() );
        peTemp.setEdad( pe.getEdad() );
        peTemp.setCurp( pe.getCurp() );
        create( peTemp );
    }
    public void udpate( Long id, PersonaEntity pe ) {
        TypedQuery<PersonaEntity> query = em.createQuery(
                "SELECT pe FROM PersonaEntity pe WHERE pe.idPersona=" + id, PersonaEntity.class);
        PersonaEntity peTemp = query.getSingleResult();
        em.getTransaction().begin();
        peTemp.setNombre( pe.getNombre() );
        peTemp.setCorreoE( pe.getCorreoE() );
        peTemp.setEdad( pe.getEdad() );
        peTemp.setCurp( pe.getCurp() );
        em.getTransaction().commit();
    }
    public void delete( PersonaEntity pe ) {
        pe = read( pe );
        em.getTransaction().begin();
        em.remove(pe);
        em.getTransaction().commit();
    }
    public void delete( Long id ) {
        PersonaEntity pe = read( id );
        em.getTransaction().begin();
        em.remove(pe);
        em.getTransaction().commit();
    }
    public void cerrarBD() {
        if( em!=null ) {
            em.close();
            }
        if( emf!=null ) {
            emf.close();
            }
    }
}
