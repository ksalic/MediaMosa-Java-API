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

package nl.uva.ic.vpcore;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import nl.uva.mediamosa.model.MediafileDetailsType;
import nl.uva.mediamosa.model.StatsDatauploadType;
import nl.uva.mediamosa.model.StatsDatausagevideoType;
import nl.uva.mediamosa.model.StatsPlayedstreamsType;
import nl.uva.mediamosa.model.StatsPopularcollectionsType;
import nl.uva.mediamosa.model.StatsPopularstreamsType;
import nl.uva.mediamosa.util.ServiceException;
import static org.junit.Assert.assertTrue;

/**
 * @version $Id$
 */
public class StatisticsTest extends AbstractTest {

	@Test
	public void testGetStatsDataUsage() throws ServiceException, IOException {
        List<StatsDatausagevideoType> dataUsageStats = service.getStatsDatausageVideo(2011, 10, "container", 100, 0);
        // container, group, user

		//assertTrue(mediafileId.equals(mediafileDetails.getMediafileId()));

	}

    @Test
    public void testStatsPlayedStreams() throws Exception {
        List<StatsPlayedstreamsType> playedStreamsStats = service.getStatsPlayedStreams(2011, 10, "object", null, null, 200, 0);
        // plain, object, download, metafile
    }

    @Test
    public void testStatsPopularStreams() throws Exception {
        List<StatsPopularstreamsType> popularStreamsStats = service.getStatsPopularStreams(200, 0);
    }

    @Test
    public void testStatsPopularCollections() throws Exception {
        List<StatsPopularcollectionsType> popularCollectionsStats = service.getStatsPopularCollections();
    }

    @Test
    public void testStatsDataUpload() throws Exception {
        List<StatsDatauploadType> dataUploads = service.getStatsDataUpload(2011, 10, null, null, 200, 0);
    }
}
