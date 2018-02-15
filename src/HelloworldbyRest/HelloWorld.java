/*package HelloworldbyRest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;
@Path("/customers")
public class HelloWorld {

	@GET
	@Produces("text/html")
	public Response getCustomer() {

		String out = "I am a local customer";

		return Response.status(200).entity(out).build();

	}
	
	
	@GET
	@Produces("text/html")
	@Path("/nri")
	public Response getNriCustomer() {
		String out="I am Nri customer ";
		return Response.status(200).entity(out).build();
		
	}
	
	@GET
	@Path("{name}/{country}")
	@Produces("text/html")
	public Response pathParammethod( @PathParam("name") String name, @PathParam("country") String country) 
       
	
	{
		
		String out="I am "+name+" I am from "+country;
		return Response.status(200).entity(out).build() ;
		
	}
	
	
	@GET
	@Produces("text/html")
	public Response queryParammethod( @QueryParam("name") String name, @QueryParam("country") String country) 
 {
		String out="I am "+name+" I am from "+country;
		return Response.status(200).entity(out).build() ;
		
	}
	@POST
	@Produces("text/html")
	@Path("/addcustomer")
	public Response formParammethod( @FormParam("name") String name, @FormParam("country") String country) 
	 {
			String out="I am "+name+" I am from "+country;
			return Response.status(200).entity(out).build() ;
			
		}

}
*/