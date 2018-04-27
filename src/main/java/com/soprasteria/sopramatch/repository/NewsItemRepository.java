package com.soprasteria.sopramatch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.sopramatch.model.NewsItem;

public interface NewsItemRepository extends CrudRepository<NewsItem, Long> {

	public List<NewsItem> findByNewsItemType(Integer type);
	
}
