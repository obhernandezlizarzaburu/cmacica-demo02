package pe.cmacica.labs.labs02.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pe.cmacica.labs.labs02.Repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired

    private ClienteRepository clienteRepository;

    @Override
    public String getNombre(int id) {

        return clienteRepository.getNombre(id);
    }

    @Override
    public String getNumeroCuenta(String cuenta) {
        return clienteRepository.getNumeroCuenta(cuenta);
    }

    @Override
    public int calcular(int n1, int n2) {
        return clienteRepository.calcular(n1,n2);
    }
}
