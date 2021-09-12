package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.CategoryResponse;
import com.tct.bestMovieApp.converters.CategoryConverter;
import com.tct.bestMovieApp.domain.Category;
import com.tct.bestMovieApp.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	CategoryConverter converter = new CategoryConverter();
	
	@Override
	public CategoryResponse saveOrUpdate(CategoryResponse domain) {
		return converter.convert(categoryRepository.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		categoryRepository.delete(id);
		
	}

	@Override
	public CategoryResponse find(Long id) {
		return converter.convert(categoryRepository.find(id));
	}

	@Override
	public List<CategoryResponse> listAll() {
		List<CategoryResponse> responseList = new ArrayList<>();
		List<Category> catList = categoryRepository.listAll();
		for ( Category c : catList ) {
			responseList.add(converter.convert(c));
		}
		return responseList;	
	}

}
