package src.application;

import src.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa(null, "Vanessa", "teste1@teste.com");
        //Pessoa p2 = new Pessoa(null, "Kerstin", "teste2@teste.com");
       //Pessoa p3 = new Pessoa(null, "Mike", "teste3@teste.com");
        //Pessoa p4 = new Pessoa(null, "Phi", "teste4@teste.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        //persistenceName está no persistence.xml

        EntityManager em = emf.createEntityManager();

        //Cria tabela no banco de dados com os objetos acima

        //em.getTransaction().begin();
       // em.persist(p1);
       // em.persist(p2);
       // em.persist(p3);
       // em.persist(p4);
        //em.getTransaction().commit();

//====================================================================================

        //Busca pessoa no banco de dados

        //Pessoa p = em.find(Pessoa.class, 2);

        //System.out.println(p);

//====================================================================================

        //Remover pessoa (precisa monitorar a entidade, recuperada do banco)

        //Pessoa p = em.find(Pessoa.class, 2);
        //em.getTransaction().begin();
        //em.remove(p);
        //em.getTransaction().commit();


       System.out.println("Pronto!");
       em.close();
       emf.close();


    }
}
