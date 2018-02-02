package dao;

import java.util.List;

import modelo.CategoryEntity;
import util.GenericDao;

public class CategoryDao extends GenericDao<CategoryEntity, Long> {

	@SuppressWarnings("unchecked")
	public List<CategoryEntity> findByCategoryName(String categoryName) {
		List<CategoryEntity> categories = (List<CategoryEntity>) this
				.executeQuery("SELECT c FROM CategoryEntity c WHERE c.categoryName = ?0", categoryName);

		return categories;
	}

}