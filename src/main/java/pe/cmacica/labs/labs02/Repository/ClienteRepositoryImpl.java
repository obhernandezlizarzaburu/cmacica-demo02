package pe.cmacica.labs.labs02.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    @Qualifier("ClienteProxyV2")
    private ClienteProxy clienteProxy;

    @Override
    public String getNombre(int id) {
        return "Oscar Hernandez Lizarzaburu";
    }

    @Override
    public String getNumeroCuenta(String cuenta) {
        return cuenta;
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteProxy.calcular(n1,n2);
    }

}
