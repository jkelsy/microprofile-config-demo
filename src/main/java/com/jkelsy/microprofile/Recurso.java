package com.jkelsy.microprofile;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("recurso")
public class Recurso {

    @Inject
    @ConfigProperty(name="JAVA_HOME")
    private String javaHome;

    @Inject
    @ConfigProperty(name="app.color", defaultValue="blue")
    private String color;

    @Inject
    @ConfigProperty(name="app.nombre")
    private String nombre;

    @GET
    public String mostrar(){
        return "JAVA_HOME = "+javaHome
        +" app.nombre = "+nombre
        +" app.color = "+color;
    }
    
}
