package generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import beans.Banks;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(final BanksRepository repo)
	{
		return new CommandLineRunner() 
		{
			@Override
			public void run(String... args) throws Exception
			{
				// fetch all customers
				log.info("Customers found with findAll():");
				log.info("-------------------------------");
				for (Banks banks : repo.findAll()) {
					log.info(banks.toString());
				
					log.info("");
				
					// fetch an individual customer by ID
					Banks bank = repo.findOne(2L);
					log.info("Customer found with findOne(1L):");
					log.info("--------------------------------");
					log.info(bank.toString());
				    log.info("");
				
					// fetch customers by last name
					log.info("Customer found with findByLastName('Bauer'):");
					log.info("--------------------------------------------");
					for (Banks cautare : repo.findByBankName("Orange Romania")) {
						log.info(cautare.toString());
					}
				    log.info("");
				}
   			}
		};
	}

}