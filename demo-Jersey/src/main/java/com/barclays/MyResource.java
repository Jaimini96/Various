package com.barclays;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    @Path("person")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Person getPersonDetails() {
       Person p = new Person();
       p.setAge(23);
       p.setName("Ajay");
       return p;
    }
    
    @Path("form")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void setPerson(@FormParam("name") String name, @FormParam("age") int age) {
       Person p = new Person();
       p.setAge(age);
       p.setName(name);
       
    }
}
