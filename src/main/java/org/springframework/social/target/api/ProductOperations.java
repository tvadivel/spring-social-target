/**
 * Copyright 2012 Target. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.social.target.api;

import java.util.List;

/**
 * Interface defining the operations for catalogs
 * @author Bobby Warner
 */
public interface ProductOperations {
	
	/**
	 * Display a list of items tied to a category ID.
	 * @param catagoryId the ID of the category
	 * @return a list of {@link Item}s for the specified category
	 * @throws ApiException if there is an error while communicating with Target.
	 */
	List<Item> getItems(String catagoryId);
	
	/**
	 * Provides a listing of product categories and sub-categories.
	 * @param categoryId the ID of the category
	 * @return a list of {@link Comment}s for the specified object
	 * @throws ApiException if there is an error while communicating with Target.
	 */
	List<Category> getCategory(String categoryId);
	
	/**
	 * Retrieves a single item
	 * @param itemId the ID of the item
	 * @return the requested {@link Item}
	 * @throws ApiException if there is an error while communicating with Target.
	 */
	Item getItem(String itemId);
}
