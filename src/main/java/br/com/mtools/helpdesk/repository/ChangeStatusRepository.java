package br.com.mtools.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.mtools.helpdesk.entity.ChangeStatus;

@Repository
public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable <ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc (String ticketId);
	
}
