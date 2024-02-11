package ru.home.testsecuritt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.testsecuritt.model.Executor;

public interface ExecutorRepository extends JpaRepository<Executor, Long> {

}
