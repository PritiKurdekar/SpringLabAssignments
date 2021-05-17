package org.capg.apps.problemstatement1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@ComponentScan("org.capg.apps.problemstatement1")
@Configuration
public class JavaConfig {

}
