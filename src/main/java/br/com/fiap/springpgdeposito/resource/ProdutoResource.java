package br.com.fiap.springpgdeposito.resource;

public class ProdutoResource {
    @Path("/produto")
    public class ProdutoResource {

        public Response getProdutos() {
            // Implementação para retornar todos os produtos
        }

        public Response criarProduto() {
            // Implementação para criar um novo produto
        }

        @Path("/{id}")
        public Response getProduto(@PathParam("id") Long id) {
            // Implementação para retornar um produto pelo ID
        }
}
