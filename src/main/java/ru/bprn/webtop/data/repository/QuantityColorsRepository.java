package ru.bprn.webtop.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bprn.webtop.data.entity.QuantityColors;

public interface QuantityColorsRepository extends JpaRepository<QuantityColors, Integer> {
}