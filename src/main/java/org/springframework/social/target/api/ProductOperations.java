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

import org.springframework.social.ApiException;
import org.springframework.social.MissingAuthorizationException;

/**
 * Interface defining the operations for products
 * @author Bobby Warner
 */
public interface ProductOperations {
	
	/**
	 * Provides a listing of product categories and sub-categories.
	 * @param catalogId the ID of the catalog
	 * @return A list of category IDs
	 * @throws ApiException if there is an error while communicating with Target.
	 * @throws MissingAuthorizationException if TargetTemplate was not created with API key.
	 */
	CursoredList<Long> category(int categoryId);
}
