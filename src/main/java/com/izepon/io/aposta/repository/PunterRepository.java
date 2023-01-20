package com.izepon.io.aposta.repository;

import com.izepon.io.aposta.model.Punter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunterRepository extends JpaRepository<Punter, Long> {

}
