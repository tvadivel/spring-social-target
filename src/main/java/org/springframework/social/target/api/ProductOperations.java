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
 * 
 * @author Bobby Warner
 */
public interface ProductOperations {

    /**
     * Provides a listing of product categories and sub-categories.
     * 
     * @param catalogId
     *            the ID of the catalog
     * @return a list of {@link Category}s for the specified object
     * @throws ApiException
     *             if there is an error while communicating with Target.
     */
    List<Category> getCatalog(String catalogId);

    /**
     * Display a list of catalog products tied to a category ID.
     * 
     * @param categoryId
     *            the ID of the category
     * @return a list of {@link Product}s for the specified category
     * @throws ApiException
     *             if there is an error while communicating with Target.
     */
    List<Product> getProducts(String categoryId);

    /**
     * Retrieve product details by product ID.
     * 
     * @param productId
     *            the ID of the product
     * @return the requested {@link Product}
     * @throws ApiException
     *             if there is an error while communicating with Target.
     */
    Product getProduct(String productId);

    /**
     * Retrieves products that satisfy the search criteria, including one or
     * more search filter options. Search operations will return 10 results at a
     * time. Search will happen against all categories for the given keyword. If
     * a BrowseNode parameter is provided, the search will be performed within
     * that category. Either BrowseNode or keywords (or both) are required. If
     * only categoryid is provided, all items within the category will be
     * returned.
     * 
     * @param keyword
     *            the search string
     * @param browseNode
     * @param pageNumber
     *            Page number of results to display. There are 10 results per
     *            page.
     * @param sort
     *            Specifies the order in which reviews are sorted.
     * @param responseGroups
     *            the response groups to return
     * @param count
     *            the number of results to be returned.
     * @param maxPrice
     *            the maximum price of the items to be returned.
     * @param minPrice
     *            the minimum price of the items to be returned.
     * @return a list of {@link Product}s for the specified search parameters
     * @throws ApiException
     *             if there is an error while communicating with Target.
     */
    List<Product> search(String keyword, String browseNode, int pageNumber,
            String sort, List<String> responseGroups, int count, int maxPrice,
            int minPrice);
}
