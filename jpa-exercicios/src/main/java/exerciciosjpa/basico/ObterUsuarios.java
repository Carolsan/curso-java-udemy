package exerciciosjpa.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("Id: " + usuario.getId()
                + " Email: " + usuario.getEmail());
        }

        /*
        List<Usuarios> usuarios = em
                    .createQuery(select u from Usuario u)
                    .setMaxResults(5)
                    .getResultList();
         */

        em.close();
        emf.close();
    }
}
