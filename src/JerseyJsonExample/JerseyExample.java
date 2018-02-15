package JerseyJsonExample;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customerxml")
public class JerseyExample {
	
	/*@GET
	@Path("/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getJsonExample(@PathParam("custId") int id) {
		Customer c=new Customer();
		c.setCustId(id);
		c.setCustName("radha");
		c.setCustNum("456567");
		return c;
	}*/
	
	
	/*@GET
	@Path("/{custId}")
	@Produces("text/html")
	public void fetchMethod(@PathParam("custId") int id) {
		System.out.println("id num "+ id+" detailes fetched successfully");
	}
	
	@POST
	@Path("/{custId}")
	@Produces("text/html")
	public void storeMethod(@PathParam("custId") int id) {
		System.out.println("id num "+ id+" detailes stored successfully");
	}

	
	@PUT
	@Path("/{custId}")
	@Produces("text/html")
	public void updateMethod(@PathParam("custId") int id) {
		System.out.println("id num "+ id+" detailes updated successfully");
	}
	
	
	@DELETE
	@Path("/{custId}")
	@Produces("text/html")
	public void deleteMethod(@PathParam("custId") int id) {
		System.out.println("id num "+ id+" detailes deleted successfully");
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{custId}")
	public Customer getCustomerXml(@PathParam("custId") int id) {
		Customer c=new Customer();
		c.setCustId(id);
		c.setCustName("radha");
		c.setCustNum("4547");
		System.out.println("output in xml");
		return c;
		
	}
	
	
	
}
