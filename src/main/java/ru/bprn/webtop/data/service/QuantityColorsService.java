package ru.bprn.webtop.data.service;

import org.springframework.stereotype.Service;
import ru.bprn.webtop.data.entity.QuantityColors;
import ru.bprn.webtop.data.repository.QuantityColorsRepository;

import java.util.List;

@Service
public class QuantityColorsService {
    private QuantityColorsRepository quantityColorsRepository;

    public QuantityColorsService (QuantityColorsRepository quantityColorsRepository) {
        this.quantityColorsRepository = quantityColorsRepository;
    }

    public List<QuantityColors> findAll (){
        return quantityColorsRepository.findAll();
    }
}
