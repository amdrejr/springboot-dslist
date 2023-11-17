package com.amdrejr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdrejr.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
