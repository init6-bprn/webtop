package ru.bprn.webtop.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bprn.webtop.data.entity.TypeOfPrinter;

public interface TypeOfPrinterRepository extends JpaRepository<TypeOfPrinter, Integer> {
}