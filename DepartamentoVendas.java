public class DepartamentoVendas implements Observer {

    @Override
    public void update(String atualizacao) {
        System.out.println("Vendas: " + atualizacao + ", já pode ser comercializado");
        
    }
    
}
