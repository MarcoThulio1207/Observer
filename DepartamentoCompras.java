public class DepartamentoCompras implements Observer {

    @Override
    public void update(String atualizacao) {
        System.out.println("Compras:" + atualizacao + ", no momento, não precisa comprar mais deste item, porém, observar suas saídas.");
        
    }
    
}
