/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.lifecycle.cache;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.cayenne.Persistent;

import static java.util.Arrays.asList;

/**
 * @since 4.0
 */
public class CacheGroupsHandler implements InvalidationHandler {

    /**
     * Return invalidation function that returns values
     * of {@link CacheGroups} and {@link CacheGroup} annotations for the given type.
     */
    @Override
    public InvalidationFunction canHandle(Class<? extends Persistent> type) {

        CacheGroup multipleCacheGroups = type.getAnnotation(CacheGroup.class);
        CacheGroups cacheGroups = type.getAnnotation(CacheGroups.class);
        if (cacheGroups == null && multipleCacheGroups == null) {
            return null;
        }

        final Collection<CacheGroupDescriptor> groupsList = new ArrayList<>();
        extractCacheGroups(cacheGroups, groupsList);
        extractCacheGroups(multipleCacheGroups, groupsList);

        return new InvalidationFunction() {
            @Override
            public Collection<CacheGroupDescriptor> apply(Persistent persistent) {
                return groupsList;
            }
        };
    }

    private void extractCacheGroups(CacheGroup cacheGroup, Collection<CacheGroupDescriptor> groupsList) {
        if(cacheGroup == null) {
            return;
        }
        groupsList.add(new CacheGroupDescriptor(cacheGroup.value(), cacheGroup.keyType(), cacheGroup.valueType()));
    }

    private void extractCacheGroups(CacheGroups cacheGroups, Collection<CacheGroupDescriptor> groupsList) {
        if(cacheGroups == null) {
            return;
        }

        for(String name : cacheGroups.value()) {
            groupsList.add(new CacheGroupDescriptor(name));
        }

        for(CacheGroup group : cacheGroups.groups()) {
            extractCacheGroups(group, groupsList);
        }
    }
}
