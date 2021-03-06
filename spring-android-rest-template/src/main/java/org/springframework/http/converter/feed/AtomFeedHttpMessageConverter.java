/*
 * Copyright 2002-2014 the original author or authors.
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

package org.springframework.http.converter.feed;

import org.springframework.http.MediaType;

import com.google.code.rome.android.repackaged.com.sun.syndication.feed.atom.Feed;

/**
 * Implementation of {@link org.springframework.http.converter.HttpMessageConverter} 
 * that can read and write Atom feeds. Specifically, this converter can handle 
 * {@link Feed} objects, from the 
 * <a href="http://code.google.com/p/android-rome-feed-reader/">Android ROME Feed Reader</a>,
 * which is a repackaging of java.net's <a href="https://rome.dev.java.net/">ROME</a>.
 *
 * <p>By default, this converter reads and writes the media type ({@code application/atom+xml}). This can
 * be overridden by setting the {@link #setSupportedMediaTypes(java.util.List) supportedMediaTypes} property.
 *
 * @author Arjen Poutsma
 * @author Roy Clarkson
 * @see Feed
 * @since 1.0
 */
public class AtomFeedHttpMessageConverter extends AbstractWireFeedHttpMessageConverter<Feed> {

	public AtomFeedHttpMessageConverter() {
		super(MediaType.APPLICATION_ATOM_XML);
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return Feed.class.isAssignableFrom(clazz);
	}


}
