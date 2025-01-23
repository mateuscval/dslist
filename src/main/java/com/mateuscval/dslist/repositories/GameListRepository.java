package com.mateuscval.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateuscval.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
