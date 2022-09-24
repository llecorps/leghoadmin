package ch.rts.si.micro.legho.clientui.dao;

import ch.rts.si.micro.legho.clientui.model.Listuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListuserDao extends JpaRepository<Listuser, Integer> {
}
