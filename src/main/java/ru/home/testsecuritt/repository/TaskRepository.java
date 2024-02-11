package ru.home.testsecuritt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.testsecuritt.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
