package com.alex.dockerpostgresflywaydemo.persistence;

import com.alex.dockerpostgresflywaydemo.domain.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Integer> {
}

