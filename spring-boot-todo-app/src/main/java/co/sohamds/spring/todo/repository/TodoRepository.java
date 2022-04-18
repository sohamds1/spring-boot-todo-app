package co.sohamds.spring.todo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import co.sohamds.spring.todo.domain.Todo;
@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo,
Long>{

}