package edu.mum.cs544.Repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs544.domain.Pet;
@Repository
public interface PetDao extends CrudRepository<Pet, Long> {

}