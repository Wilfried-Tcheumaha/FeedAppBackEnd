package com.bptn.FeedApplication.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.FeedApplication.jpa.FeedMetaData;



public interface FeedMetaDataRepository extends JpaRepository<FeedMetaData, Integer> {
	
}