package at.fhjoanneum.ippr.processengine.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import at.fhjoanneum.ippr.persistence.entities.engine.process.ProcessInstanceImpl;

@Repository
public interface ProcessInstanceRepository
    extends PagingAndSortingRepository<ProcessInstanceImpl, Long> {

  @Query(value = "SELECT COUNT(p.piId) FROM PROCESS_INSTANCE p WHERE p.state = 'ACTIVE'")
  Long getAmountOfActiveProcesses();
}
