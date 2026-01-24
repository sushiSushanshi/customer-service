package infosync.customer_service.service;

import infosync.customer_service.entity.Party;
import org.springframework.stereotype.Service;

@Service
public interface PartyService {
    void createParty(Party party);
}
