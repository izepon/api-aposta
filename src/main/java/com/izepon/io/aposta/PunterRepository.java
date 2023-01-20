package com.izepon.io.aposta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunterRepository extends JpaRepository<Punter, Long> {

}
