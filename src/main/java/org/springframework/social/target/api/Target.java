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

import org.springframework.social.ApiBinding;
import org.springframework.social.target.api.impl.TargetTemplate;

/**
 * Interface specifying a basic set of operations for interacting with Target
 * APIs. Implemented by {@link TargetTemplate}.
 *
 * @author Bobby Warner
 */
public interface Target extends ApiBinding {
	
	/**
	 * Returns the portion of the Target API containing the catalog operations.
	 */
	CatalogOperations catalogOperations();
	
	/**
	 * Returns the portion of the Target API containing the item operations.
	 */
	ItemOperations itemOperations();
	
	/**
	 * Returns the portion of the Target API containing the list operations.
	 */
	ListOperations listOperations();
	
	/**
	 * Returns the portion of the Target API containing the catalog operations.
	 */
	LocationOperations locationOperations();
	
	/**
	 * Returns the portion of the Target API containing the catalog operations.
	 */
	StoreOperations storeOperations();
}
