package com.uglyOrgan.jsonToDB.repository;

import com.uglyOrgan.jsonToDB.model.Disc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscRepository extends JpaRepository<Disc, Long> {

    List<Disc> findByDiscName(String name);
}
