public class DepartamentoMarketing  implements Observer{

    @Override
    public void update(String atualizacao) {
        System.out.println("Marketing:" + atualizacao + " , já pode entrar em promoção. Começe a divulgar");
        
    }
    
}
