package exerciciosjpa.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 5L);
        usuario.setNome("Adalberto Vieira");
        usuario.setEmail("adalberto.vieira1930@gmail.com");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
