public class Principal {
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        Observer compras = new DepartamentoCompras();
        Observer vendas = new DepartamentoVendas();
        Observer marketing = new DepartamentoMarketing();

        estoque.registrar(compras);
        estoque.registrar(vendas);
        estoque.registrar(marketing);

        System.out.println("O item está acabando");
        System.out.println("Precisamos comprar mais desse item");

        estoque.setEstoqueProduto(true);

    }
}
