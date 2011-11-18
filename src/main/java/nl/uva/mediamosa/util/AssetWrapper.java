/**
 * MediaMosa API
 *
 * A partial implementation of the MediaMosa API in Java.
 *
 * Copyright 2010 Universiteit van Amsterdam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.uva.mediamosa.util;

import nl.uva.mediamosa.model.AssetType;

import java.util.List;
import java.util.logging.Logger;

/**
 * @version $Id$
 */
public class AssetWrapper {
    @SuppressWarnings({"UnusedDeclaration"})
   private static final Logger log = Logger.getLogger(XmlParserUtil.class.getName());

    private long totalCount;
    private List<AssetType> typeList;

    public AssetWrapper(long totalCount, List<AssetType> typeList) {
        this.totalCount = totalCount;
        this.typeList = typeList;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<AssetType> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<AssetType> typeList) {
        this.typeList = typeList;
    }
}
