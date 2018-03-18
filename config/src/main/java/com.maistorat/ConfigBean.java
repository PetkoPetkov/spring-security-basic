package com.maistorat;

/**
 * Created by Petio on 26.2.2018 г..
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Import(DataBasesConfig.class)
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
@ComponentScan(basePackages = "com.maistorat")
public class ConfigBean {
}
