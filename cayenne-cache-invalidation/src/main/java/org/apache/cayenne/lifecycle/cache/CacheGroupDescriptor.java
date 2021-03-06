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

/**
 * Immutable object describing cache group.
 * Used as a result in {@link InvalidationFunction}.
 *
 * @see CacheGroupDescriptor#CacheGroupDescriptor(String)
 * @see CacheGroupDescriptor#CacheGroupDescriptor(String, Class, Class)
 *
 * @since 4.0
 */
public class CacheGroupDescriptor {

    private final String cacheGroupName;

    private final Class<?> keyType;

    private final Class<?> valueType;

    public CacheGroupDescriptor(String cacheGroupName) {
        this(cacheGroupName, Void.class, Void.class);
    }

    public CacheGroupDescriptor(String cacheGroupName, Class<?> keyType, Class<?> valueType) {
        this.cacheGroupName = cacheGroupName;
        this.keyType = keyType;
        this.valueType = valueType;
    }

    public String getCacheGroupName() {
        return cacheGroupName;
    }

    public Class<?> getKeyType() {
        return keyType;
    }

    public Class<?> getValueType() {
        return valueType;
    }
}
