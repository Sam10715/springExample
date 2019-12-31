package com.firstExample.sping_example.service;

import com.firstExample.sping_example.model.IdCard;
import com.firstExample.sping_example.respositires.IdCardRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IdCardServiceImpl2 implements IdCardService {
    @Autowired
    private IdCardRepositry idCardRepositry;

    @Override
    public List<IdCard> getAll() {
        List<IdCard> idCards=idCardRepositry.findAll();
        idCards.add(new IdCard());
        return idCards;
    }
}
