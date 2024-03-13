package br.com.fiap.springpgdeposito.resource;

import jakarta.websocket.server.PathParam;
import org.apache.catalina.connector.Response;
public class EnderecoResource {
    @Path("/endereco")
    public class EnderecoResource {

        public Response getEnderecos() {

        }

        public Response criarEndereco() {

        }

        @Path("/{id}")
        public Response getEndereco(@PathParam("id") Long id) {

        }
}
