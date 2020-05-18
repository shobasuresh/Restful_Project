package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
@Path("/book")
public class Book {
	
/*@GET
@Produces(MediaType.TEXT_XML)
	public String sayHelloXML()
	{
		
		String response="<?xml version='1.0'?>"+
		"<hello>Hello XML</hello>";
		return response;
		
	}*/

	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String sayHelloXML(@PathParam("name") String nam)
	{
		
		String response2="<?xml version='1.0'?>"+
		"<MyProduct>  <Product id='1'> "
		+ " <Description>Laptop "+nam+"</Description> "
		+ " <Price>870</Price> </Product> </MyProduct>";
		return response2;
	}	
	
		
	/*	String response="<?xml version='1.0'?>"+
				"<hello>Hello XML "+nam+"</hello>";
				return response;*/
		
		
		/*<?xml version="1.0" encoding="UTF-8"?>
		<MyProduct>  
		  <Product id="1">  
		   <Description>Laptop</Description>   
		  <Price>870</Price>
		     
		 </Product>  
		      
		<Product id="2">  
		  
		 <Description>Monitor</Description>
		 <Price>200</Price>  
		    
		</Product> 
		</MyProduct>*/
		
	}

/*@GET
@Produces(MediaType.TEXT_HTML)
@Path("{name}")
	public String sayHello(@PathParam("name") String nam)
	{
		
		String response="<h1>Hello HTML</h1>"+nam;
		return response;
		
	}*/
	
	
	/*@GET  
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String sayPlainTextHello() {  
	    return "Hello Jersey Plain";  
	  }  
*/
//}
