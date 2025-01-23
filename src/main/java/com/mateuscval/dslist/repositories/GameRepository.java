package com.mateuscval.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateuscval.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
