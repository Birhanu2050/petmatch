package edu.mum.cs544.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.mum.cs544.Repositories.PetDao;
import edu.mum.cs544.domain.Pet;

@Service
@Transactional
public class PetService {
@Autowired
private PetDao petDao;
public void save(Pet pet){
	petDao.save(pet);
}
}
