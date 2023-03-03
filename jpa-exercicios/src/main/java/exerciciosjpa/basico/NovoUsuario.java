package exerciciosjpa.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Joana Moura Marques", "moura.joana@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
