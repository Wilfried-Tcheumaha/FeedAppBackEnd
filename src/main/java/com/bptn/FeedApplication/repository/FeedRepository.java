package com.bptn.FeedApplication.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bptn.FeedApplication.jpa.Feed;
import com.bptn.FeedApplication.jpa.User;

public interface FeedRepository extends JpaRepository<Feed, Integer>, PagingAndSortingRepository<Feed, Integer> {

	
Page<Feed> findByUser(User user, Pageable pageable);
	
Page<Feed> findByUserNot(User user, Pageable pageable);

}
