package com.example.Market.persistence.mapper;

import com.example.Market.domain.Category;
import com.example.Market.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(source = "descriptionCategory", target = "description")
    Category toCategory(CategoryEntity category);
    List<Category> toCategories(List<CategoryEntity> categories);

    @InheritInverseConfiguration
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "product", ignore = true)
    CategoryEntity toCategoryEntity(Category category);
}
