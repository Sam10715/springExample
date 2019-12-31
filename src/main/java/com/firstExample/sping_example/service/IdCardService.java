package com.firstExample.sping_example.service;

import com.firstExample.sping_example.model.IdCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IdCardService {

    public List<IdCard> getAll();
}
