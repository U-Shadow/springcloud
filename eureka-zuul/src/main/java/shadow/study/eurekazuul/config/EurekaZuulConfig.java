package shadow.study.eurekazuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shadow.study.eurekazuul.filter.AuthFilter;

@Configuration
public class EurekaZuulConfig {

    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter();
    }
}
