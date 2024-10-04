package lk.ijse.spring_pos_api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring_pos_api")
@EnableWebMvc
@EnableJpaRepositories(basePackages = "lk.ijse.spring_pos_api")
@EnableTransactionManagement
public class WebAppConfig {}
