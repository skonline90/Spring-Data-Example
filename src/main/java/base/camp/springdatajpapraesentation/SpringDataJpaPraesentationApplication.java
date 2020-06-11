package base.camp.springdatajpapraesentation;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import base.camp.springdatajpapraesentation.entities.Pet;
import base.camp.springdatajpapraesentation.repositories.PetRepository;

@SpringBootApplication
public class SpringDataJpaPraesentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPraesentationApplication.class, args);
	}

	@Bean
	public CommandLineRunner petDemo(PetRepository petRepository) {
		return (args) -> {
			// Haustiere erzeugen
			petRepository.save(new Pet("Butkus", "Dog", "Paul", new Date()));
			petRepository.save(new Pet("Snowball", "Dog", "Jenny", new Date()));
			petRepository.save(new Pet("Lola", "Cat", "John", new Date()));
			petRepository.save(new Pet("Furrball", "Cat", "Linus", new Date()));

			// fetch all pets
			System.out.println("Pets found with findAll():");
			System.out.println("---------------------------");
			for (Pet pet : petRepository.findAll()) {
				System.out.println(pet.toString());
			}
			System.out.println();

			// fetch pet by id
			Pet pet = petRepository.findById(1L).get();
			System.out.println("Pet found with findById(1L):");
			System.out.println("-----------------------------");
			System.out.println(pet.toString());
			System.out.println();

			// update pet title
			Pet petUpdate = petRepository.findById(2L).get();
			petUpdate.setOwner("Simon");
			petRepository.save(petUpdate);
			System.out.println("Update pet owner:");
			System.out.println("------------------");
			System.out.println(petUpdate.toString());
			System.out.println();

			// total pets in DB
			System.out.println("Total pets in DB:");
			System.out.println("------------------");
			System.out.println(petRepository.count());
			System.out.println();

			// delete all pets
			 petRepository.deleteAll();
		};
	}
}
