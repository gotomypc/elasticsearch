/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.field.data;

/**
 * @author kimchy (shay.banon)
 */
public class FieldDataOptions {

    public static FieldDataOptions fieldDataOptions() {
        return new FieldDataOptions();
    }

    boolean freqs = false;

    public final FieldDataOptions withFreqs(boolean freqs) {
        this.freqs = freqs;
        return this;
    }

    public final boolean hasFreqs() {
        return freqs;
    }

    public boolean subsetOf(FieldDataOptions options) {
        if (freqs && !options.freqs) {
            return false;
        }
        return true;
    }
}