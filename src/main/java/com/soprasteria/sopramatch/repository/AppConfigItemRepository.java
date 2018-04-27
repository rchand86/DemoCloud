package com.soprasteria.sopramatch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.sopramatch.model.AppConfigItem;
import com.soprasteria.sopramatch.model.AppConfiguration;

public interface AppConfigItemRepository extends CrudRepository<AppConfigItem, Long> {

	public List<AppConfigItem> findByAppConfig(final AppConfiguration appConfiguration);
}
