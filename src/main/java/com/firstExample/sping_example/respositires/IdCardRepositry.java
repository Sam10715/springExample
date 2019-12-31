package com.firstExample.sping_example.respositires;

import com.firstExample.sping_example.model.IdCard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IdCardRepositry extends CrudRepository<IdCard,Integer> {
List<IdCard> findAll();
}
