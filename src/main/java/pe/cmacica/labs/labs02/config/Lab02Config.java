package pe.cmacica.labs.labs02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.cmacica.labs.labs02.Service.CuentaService;
import pe.cmacica.labs.labs02.Service.CuentaServiceImpl;

@Configuration
public class Lab02Config {

    @Bean
    public CuentaService getCuentaService()
    {
        CuentaService cuentaService=new CuentaServiceImpl();

        return cuentaService;
    }
}
