package computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import computers.beans.Computer;
import computers.config.ComputerBeanConfig;
import computers.repo.IComputersRepo;

@SpringBootApplication
public class SpringComputersW8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersW8Application.class, args);
	}
	
	@Autowired
	IComputersRepo repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComputerBeanConfig.class);
		Computer computer = context.getBean(Computer.class);
		
		computer.setComputerDesc("High-end Rendering PC");
		computer.setComputerPrice(3204.50);
		computer.setNumberOfFans(12);
		computer.setRGB(true);
		
		repo.save(computer);
		
		((AbstractApplicationContext) context).close();
		
	}

}
