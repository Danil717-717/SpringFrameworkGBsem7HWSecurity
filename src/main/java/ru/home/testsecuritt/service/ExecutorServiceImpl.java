package ru.home.testsecuritt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.home.testsecuritt.model.Executor;
import ru.home.testsecuritt.repository.ExecutorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExecutorServiceImpl implements ExecutorService {

    private final ExecutorRepository repository;

    @Override
    public List<Executor> findAll() {
        return repository.findAll();
    }

    @Override
    public Executor findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reader not found"));
    }

    @Override
    public Executor save(Executor executor) {
        return repository.save(executor);
    }

    public Executor getExecutor(Long id) {
        return findAll().stream().filter(executor  -> executor.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Executor updateExecutor(Long id, Executor executor) {
        Executor executorStaraya = getExecutor(id);
        if (executorStaraya != null) {
            executorStaraya.setName(executor.getName());
        }
        return executorStaraya;
    }

    @Override
    public Executor apdateExecutor(Executor executor) {
        return repository.save(executor);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
