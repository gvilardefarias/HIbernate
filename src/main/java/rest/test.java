package rest;

import hibernate.HibernateUtil;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import entity.Pessoa;

@Path("/hibernate")
public class test {
	
	@GET
	public Response testing (){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gustavo");
		pessoa.setCargo("Estudante");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {			
			session.beginTransaction();
			session.save(pessoa);
			session.getTransaction().commit();

		} catch (HibernateException e) {
			
			session.getTransaction().rollback();
			
		} finally {
			
			session.close();
		}
        
        return Response.status(200).entity("ok").build();
	}
}
