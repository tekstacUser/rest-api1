package com.REST_01;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {
	
	@GET
	@Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> get() {
		ProductDAO dao = new ProductDAO();
        return dao.getAllProduct();
    }
	
	
}
