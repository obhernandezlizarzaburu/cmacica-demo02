package pe.cmacica.labs.labs02.Repository;

public interface ClienteRepository {

    String getNombre(int id);
    String getNumeroCuenta(String cuenta);
    int calcular(int n1,int n2);
}
