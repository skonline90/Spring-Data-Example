package base.camp.springdatajpapraesentation.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import base.camp.springdatajpapraesentation.entities.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findByName(String name);
}
