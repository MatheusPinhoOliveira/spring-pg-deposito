package br.com.fiap.springpgdeposito.resource;

import jakarta.websocket.server.PathParam;
import oracle.jdbc.proxy.annotation.GetCreator;
import oracle.jdbc.proxy.annotation.Post;
import org.hibernate.annotations.GeneratorType;


public class DepositoResource {
    @GET
    public void getDepositos() {

    }
    @Post
    public void criarDeposito() {

    }
    @GET
    public void getDeposito(@PathParam("id") Long id) {

    }
}
