package scr;

public class Main {
  
}

public class Main {
    public static void main(String[] args) {

        // ============================================
        // FILA DE CLIENTES
        // ============================================
        System.out.println("=== FILA DE CLIENTES ===");
        Fila<Cliente> filaClientes = new Fila<>();

        filaClientes.adicionar(new Cliente("Eduarda Bolner", "123.456.789-00"));
        filaClientes.adicionar(new Cliente("Maria Silva", "987.654.321-00"));

        System.out.println("\n-- Todos os clientes --");
        filaClientes.listar();

        System.out.println("\n-- Primeiro da fila --");
        System.out.println(filaClientes.primeiro());

        System.out.println("\n-- Removendo próximo --");
        System.out.println("Removido: " + filaClientes.proximo());

        System.out.println("\n-- Clientes restantes --");
        filaClientes.listar();

        System.out.println("\nQuantidade: " + filaClientes.quantidade());

        // ============================================
        // FILA DE CHAMADOS
        // ============================================
        System.out.println("\n=== FILA DE CHAMADOS ===");
        Fila<Chamado> filaChamados = new Fila<>();

        filaChamados.adicionar(new Chamado(1, "Computador não liga"));
        filaChamados.adicionar(new Chamado(2, "Sem acesso à internet"));

        System.out.println("\n-- Todos os chamados --");
        filaChamados.listar();

        System.out.println("\n-- Primeiro da fila --");
        System.out.println(filaChamados.primeiro());

        System.out.println("\n-- Removendo próximo --");
        System.out.println("Removido: " + filaChamados.proximo());

        System.out.println("\n-- Chamados restantes --");
        filaChamados.listar();

        System.out.println("\nQuantidade: " + filaChamados.quantidade());

        // ============================================
        // FILA DE PEDIDOS
        // ============================================
        System.out.println("\n=== FILA DE PEDIDOS ===");
        Fila<Pedido> filaPedidos = new Fila<>();

        filaPedidos.adicionar(new Pedido(101, 150.00));
        filaPedidos.adicionar(new Pedido(102, 349.90));

        System.out.println("\n-- Todos os pedidos --");
        filaPedidos.listar();

        System.out.println("\n-- Primeiro da fila --");
        System.out.println(filaPedidos.primeiro());

        System.out.println("\n-- Removendo próximo --");
        System.out.println("Removido: " + filaPedidos.proximo());

        System.out.println("\n-- Pedidos restantes --");
        filaPedidos.listar();

        System.out.println("\nQuantidade: " + filaPedidos.quantidade());
    }
}