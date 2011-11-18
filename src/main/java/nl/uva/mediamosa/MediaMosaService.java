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

package nl.uva.mediamosa;

import nl.uva.mediamosa.impl.MediaMosaImpl;
import nl.uva.mediamosa.model.*;
import nl.uva.mediamosa.util.ServiceException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class MediaMosaService extends Service {

    /**
     * MediaMosa implementation
     */
    private final MediaMosa vpcoreImpl;

    /**
     * Boolean for keeping track of cookie status
     */
    // private boolean isValidCookie;

    /**
     * Initialize <code>MediaMosaService</code> with specific hostname.
     *
     * @param hostname
     */
    public MediaMosaService(String hostname) {

        vpcoreImpl = Factory.create(hostname);

    }

    /**
     * Sets the service credentials used for authentication. By calling this
     * method a request of type HANDSHAKE is done to obtain a valid session.
     *
     * @param username VpCore user name
     * @param password VpCore password
     * @throws java.io.IOException
     * @throws ServiceException
     */
    public void setCredentials(String username, String password)
            throws ServiceException {

        vpcoreImpl.setCredentials(username, password);

    }

    //new
    public String doGetRequestString(String getRequest) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.doGetRequestString(getRequest);
    }

    //new
    public String doPostRequestString(String post, String getRequest) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.doPostRequestString(post, getRequest);
    }

    //new
    public long getAssetCount(String owner, String group) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.getAssetCount(owner, group);
    }

    //new
    public JobType createStill(String assetId, String mediafileId, String userId, Map map) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.createStill(assetId, mediafileId, userId, map);
    }

    //new
    public Response deleteStill(String assetId, String mediafileId, String userId, Map map) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.deleteStill(assetId, mediafileId, userId, map);
    }

    //new
    public Response uploadStill(String assetId, Map map, InputStream stream, String mimeType, String filename) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.uploadStill(assetId, map, stream, mimeType, filename);
    }

    //new
    public JobDetailsType getJobStatus(String jobId, String userId) throws IOException, ServiceException {
        prepare();
        return vpcoreImpl.getJobStatus(jobId, userId);
    }

    //new
    public StillType getStills(String assetId, String userId, Map properties) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStills(assetId, userId, properties);
    }

    //new
    public Response setDefaultStill(String assetId, String userId, Map properties) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.setDefaultStill(assetId, userId, properties);
    }


    /**
     * Propagates login to the protocol implementation.
     *
     * @throws java.io.IOException
     * @throws ServiceException
     * @throws java.io.IOException
     */
    private boolean login() throws ServiceException, IOException {

        return vpcoreImpl.login();
    }

    public List<ErrorcodeType> getErrorCodes() throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.getErrorCodes();
    }

    public LinkType getPlayLink(String assetId, String mediafileId,
                                String userId) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getPlayLink(assetId, mediafileId, userId);
    }

    public LinkType getPlayLink(String assetId, String mediafileId,
                                String userId, int width) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getPlayLink(assetId, mediafileId, userId, width);
    }

    public LinkType getPlayLink(String assetId, String mediafileId,
                                String userId, String responseType) throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.getPlayLink(assetId, mediafileId, userId,
                responseType);
    }

    public LinkType getStillLink(String assetId, String userId)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStillLink(assetId, userId);
    }

    public UploadTicketType createUploadTicket(String mediafileId, String userId)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.createUploadTicket(mediafileId, userId);
    }

    //new
    public UploadTicketType createUploadTicket(String mediafileId, String userId, boolean isStill)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.createUploadTicket(mediafileId, userId, isStill);
    }

    public String createAsset(String userId) throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.createAsset(userId);
    }

    public String createMediafile(String assetId, String userId)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.createMediafile(assetId, userId);
    }

    public List<AssetType> getAssets() throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getAssets();
    }

    public List<AssetType> getAssets(Map properties) throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.getAssets(properties);
    }

    public List<AssetType> getAssets(int limit, int offset, Map properties) throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.getAssets(limit, offset, properties);
    }

    public long getAssetCount(int limit, Map properties) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getAssetCount(limit, properties);
    }

    public AssetDetailsType getAssetDetails(String assetId)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getAssetDetails(assetId);

    }

    public String getVersion() throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getVersion();
    }

    public Response setMetadata(String assetId, String userId, Map metadata)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.setMetadata(assetId, userId, metadata);
    }

    public void deleteMetadata(String assetId, String userId)
            throws ServiceException, IOException {
        prepare();
        vpcoreImpl.deleteMetadata(assetId, userId);
    }

    public void deleteAsset(String assetId, String userId, boolean cascade)
            throws ServiceException, IOException {
        prepare();
        vpcoreImpl.deleteAsset(assetId, userId, cascade);
    }

    public Response updateMediafile(String mediafileId, String userId,
                                    Map properties) throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.updateMediafile(mediafileId, userId, properties);
    }

    public void deleteMediafile(String mediafileId, String userId)
            throws ServiceException, IOException {
        prepare();
        vpcoreImpl.deleteMediafile(mediafileId, userId);
    }

    public MediafileDetailsType getMediafileDetails(String mediafileId)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getMediafileDetails(mediafileId);
    }

    public List<StatsDatausagevideoType> getStatsDatausageVideo(int year,
                                                                int month, String type, int limit, int offset)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStatsDatausageVideo(year, month, type, limit,
                offset);
    }

    public List<StatsDatauploadType> getStatsDataUpload(int year, int month, String userId, String groupId, int limit, int offset)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStatsDataUpload(year, month, userId, groupId, limit, offset);
    }

    public List<StatsPlayedstreamsType> getStatsPlayedStreams(int year, int month, String playType, String groupId, String ownerId, int limit, int offset)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStatsPlayedStreams(year, month, playType, groupId, ownerId, limit, offset);
    }

    public List<StatsPopularstreamsType> getStatsPopularStreams(int limit, int offset)
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStatsPopularStreams(limit,
                offset);
    }

    public List<StatsPopularcollectionsType> getStatsPopularCollections()
            throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getStatsPopularCollections();
    }

    public List<ProfileType> getProfiles() throws ServiceException, IOException {
        prepare();
        return vpcoreImpl.getProfiles();
    }

    public List<AssetType> getCqlAssets(String cql) throws ServiceException,
            IOException {
        prepare();
        return vpcoreImpl.getCqlAssets(cql);
    }

    private void prepare() throws ServiceException, IOException {
        synchronized (vpcoreImpl) {
            if (!vpcoreImpl.isValidCookie()) {
                vpcoreImpl.login();
            }
        }
    }

    /**
     *
     *
     */
    private static class Factory {

        /**
         * Creates an MediaMosaService instance.
         *
         * @return
         */
        public static MediaMosa create(String hostname) {
            MediaMosa impl = loadImpl(MediaMosaImpl.class);
            impl.setHostname(hostname);
            return impl;
        }

        /**
         * Loads a class via reflection.
         *
         * @param clazz clazz to load
         * @return
         * @throws IllegalStateException
         */
        private static MediaMosa loadImpl(Class<? extends MediaMosa> clazz) {
            Object impl = null;
            try {
                impl = clazz.newInstance();
                if (!(impl instanceof MediaMosa)) {
                    throw new InstantiationException(
                            "Implemenation class is null or not an instance of MediaMosa");
                }
            } catch (Exception e) {
                String msg = e.getMessage() + " - " + e.getCause();
                logger.severe(msg);
                throw new IllegalStateException(msg, e);
            }

            return (MediaMosa) impl;
        }
    }

}
