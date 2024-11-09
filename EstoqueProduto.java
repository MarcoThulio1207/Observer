import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observadores = new ArrayList<>();
    private boolean produtoEstoque;

    public void setEstoqueProduto(boolean produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
        if (produtoEstoque){
            notificar();
        }
    }

    @Override
    public void notificar() {
        for (Observer observer : observadores){
            observer.update("O Item retornou ao Estoque");
        }
    }

    @Override
    public void registrar(Observer observer) {
        observadores.add(observer);
        
    }

    @Override
    public void remover(Observer observer) {
        observadores.remove(observer);
        
    }

    




}
