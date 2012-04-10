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

import java.util.ArrayList;
import java.util.Collection;

/**
 * List that includes previous and next cursors for paging through items.
 * @author Bobby Warner
 * @param <T> the list element type
 */
@SuppressWarnings("serial")
public class CursoredList<T> extends ArrayList<T> {

	private final long previousCursor;

	private final long nextCursor;

	public CursoredList(Collection<? extends T> collection, long previousCursor, long nextCursor) {
		super(collection);
		this.previousCursor = previousCursor;
		this.nextCursor = nextCursor;
	}

	public CursoredList(int initialCapacity, long previousCursor, long nextCursor) {
		super(initialCapacity);
		this.previousCursor = previousCursor;
		this.nextCursor = nextCursor;
	}

	/**
	 * The cursor to retrieve the previous page of results.
	 */
	public long getPreviousCursor() {
		return previousCursor;
	}

	/**
	 * The cursor to retrieve the next page of results.
	 */
	public long getNextCursor() {
		return nextCursor;
	}

	/**
	 * Returns true if there is a previous page of results.
	 */
	public boolean hasPrevious() {
		return previousCursor > 0;
	}

	/**
	 * Returns true if there is a next page of results.
	 */
	public boolean hasNext() {
		return nextCursor > 0;
	}
}
