package com.amdrejr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
