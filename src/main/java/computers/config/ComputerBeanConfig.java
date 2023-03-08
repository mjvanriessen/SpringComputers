/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package computers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import computers.beans.Computer;

@Configuration
public class ComputerBeanConfig {
	
	@Bean
	public Computer computer() {
		Computer computer = new Computer();
		return computer;
	}

}
