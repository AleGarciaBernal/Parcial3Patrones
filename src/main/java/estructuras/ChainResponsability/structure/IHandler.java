package estructuras.ChainResponsability.structure;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int amount);
    IHandler next();
}
