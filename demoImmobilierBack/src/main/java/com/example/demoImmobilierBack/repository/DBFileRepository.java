package com.example.demoImmobilierBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoImmobilierBack.model.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}