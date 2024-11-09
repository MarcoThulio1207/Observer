public interface Estoque {
    void registrar ( Observer observer);
    void remover (Observer observer);
    void notificar();
}
