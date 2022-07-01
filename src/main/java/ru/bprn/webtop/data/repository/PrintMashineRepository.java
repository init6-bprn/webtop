package ru.bprn.webtop.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bprn.webtop.data.entity.PrintMashine;

public interface PrintMashineRepository extends JpaRepository<PrintMashine, Integer> {
}