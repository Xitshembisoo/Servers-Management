package com.Standardbank.Server.repo;

import com.Standardbank.Server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long>{

Server findByIpAddress(String ipAddress);


}
