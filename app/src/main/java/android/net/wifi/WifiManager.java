package android.net.wifi;
//import android.annotation.NonNull;
import org.jetbrains.annotations.Nullable;
import android.net.DhcpInfo;
import android.net.wifi.hotspot2.PasspointConfiguration;
import android.os.Handler;
import android.os.WorkSource;

import androidx.annotation.NonNull;

import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Executor;



    public class WifiManager {
        public static final String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
        public static final String ACTION_REQUEST_SCAN_ALWAYS_AVAILABLE = "android.net.wifi.action.REQUEST_SCAN_ALWAYS_AVAILABLE";
        public static final String ACTION_WIFI_NETWORK_SUGGESTION_POST_CONNECTION = "android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION";
        public static final String ACTION_WIFI_SCAN_AVAILABILITY_CHANGED = "android.net.wifi.action.WIFI_SCAN_AVAILABILITY_CHANGED";
        /** @deprecated */
        @Deprecated
        public static final int ERROR_AUTHENTICATING = 1;
        /** @deprecated */
        @Deprecated
        public static final String EXTRA_BSSID = "bssid";
        public static final String EXTRA_NETWORK_INFO = "networkInfo";
        public static final String EXTRA_NETWORK_SUGGESTION = "android.net.wifi.extra.NETWORK_SUGGESTION";
        public static final String EXTRA_NEW_RSSI = "newRssi";
        /** @deprecated */
        @Deprecated
        public static final String EXTRA_NEW_STATE = "newState";
        public static final String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
        public static final String EXTRA_RESULTS_UPDATED = "resultsUpdated";
        public static final String EXTRA_SCAN_AVAILABLE = "android.net.wifi.extra.SCAN_AVAILABLE";
        /** @deprecated */
        @Deprecated
        public static final String EXTRA_SUPPLICANT_CONNECTED = "connected";
        /** @deprecated */
        @Deprecated
        public static final String EXTRA_SUPPLICANT_ERROR = "supplicantError";
        /** @deprecated */
        @Deprecated
        public static final String EXTRA_WIFI_INFO = "wifiInfo";
        public static final String EXTRA_WIFI_STATE = "wifi_state";
        public static final String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
        public static final String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
        public static final String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
        public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_DUPLICATE = 3;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_EXCEEDS_MAX_PER_APP = 4;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_INVALID = 7;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_NOT_ALLOWED = 6;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_APP_DISALLOWED = 2;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_INTERNAL = 1;
        public static final int STATUS_NETWORK_SUGGESTIONS_ERROR_REMOVE_INVALID = 5;
        public static final int STATUS_NETWORK_SUGGESTIONS_SUCCESS = 0;
        public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_ASSOCIATION = 1;
        public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_AUTHENTICATION = 2;
        public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_IP_PROVISIONING = 3;
        public static final int STATUS_SUGGESTION_CONNECTION_FAILURE_UNKNOWN = 0;
        /** @deprecated */
        @Deprecated
        public static final String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
        /** @deprecated */
        @Deprecated
        public static final String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
        public static final String UNKNOWN_SSID = "<unknown ssid>";
        /** @deprecated */
        @Deprecated
        public static final int WIFI_MODE_FULL = 1;
        public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
        public static final int WIFI_MODE_FULL_LOW_LATENCY = 4;
        /** @deprecated */
        @Deprecated
        public static final int WIFI_MODE_SCAN_ONLY = 2;
        public static final String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
        public static final int WIFI_STATE_DISABLED = 1;
        public static final int WIFI_STATE_DISABLING = 0;
        public static final int WIFI_STATE_ENABLED = 3;
        public static final int WIFI_STATE_ENABLING = 2;
        public static final int WIFI_STATE_UNKNOWN = 4;
        /** @deprecated */
        @Deprecated
        public static final int WPS_AUTH_FAILURE = 6;
        /** @deprecated */
        @Deprecated
        public static final int WPS_OVERLAP_ERROR = 3;
        /** @deprecated */
        @Deprecated
        public static final int WPS_TIMED_OUT = 7;
        /** @deprecated */
        @Deprecated
        public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
        /** @deprecated */
        @Deprecated
        public static final int WPS_WEP_PROHIBITED = 4;

        WifiManager() {
            throw new RuntimeException("Stub!");
        }

        public void testTest()
        {
            ;
        }

        /** @deprecated */
        @Deprecated
        public List<WifiConfiguration> getConfiguredNetworks() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public int addNetwork(WifiConfiguration config) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public int updateNetwork(WifiConfiguration config) {
            throw new RuntimeException("Stub!");
        }

        public int addNetworkSuggestions(@NonNull List<WifiNetworkSuggestion> networkSuggestions) {
            throw new RuntimeException("Stub!");
        }

        public int removeNetworkSuggestions(@NonNull List<WifiNetworkSuggestion> networkSuggestions) {
            throw new RuntimeException("Stub!");
        }

        @NonNull
        public List<WifiNetworkSuggestion> getNetworkSuggestions() {
            throw new RuntimeException("Stub!");
        }

        public int getMaxNumberOfNetworkSuggestionsPerApp() {
            throw new RuntimeException("Stub!");
        }

        public void addOrUpdatePasspointConfiguration(PasspointConfiguration config) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public void removePasspointConfiguration(String fqdn) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public List<PasspointConfiguration> getPasspointConfigurations() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean removeNetwork(int netId) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean enableNetwork(int netId, boolean attemptConnect) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean disableNetwork(int netId) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean disconnect() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean reconnect() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean reassociate() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean pingSupplicant() {
            throw new RuntimeException("Stub!");
        }

        public boolean isP2pSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isStaApConcurrencySupported() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean isDeviceToApRttSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isPreferredNetworkOffloadSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isTdlsSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isEnhancedPowerReportingSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean is5GHzBandSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean is6GHzBandSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isWifiStandardSupported(int standard) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean startScan() {
            throw new RuntimeException("Stub!");
        }

        public WifiInfo getConnectionInfo() {
            throw new RuntimeException("Stub!");
        }

        public List<ScanResult> getScanResults() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean isScanAlwaysAvailable() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean saveConfiguration() {
            throw new RuntimeException("Stub!");
        }

        public DhcpInfo getDhcpInfo() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public boolean setWifiEnabled(boolean enabled) {
            throw new RuntimeException("Stub!");
        }

        public int getWifiState() {
            throw new RuntimeException("Stub!");
        }

        public boolean isWifiEnabled() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public static int calculateSignalLevel(int rssi, int numLevels) {
            throw new RuntimeException("Stub!");
        }

        public int calculateSignalLevel(int rssi) {
            throw new RuntimeException("Stub!");
        }

        public int getMaxSignalLevel() {
            throw new RuntimeException("Stub!");
        }

        public static int compareSignalLevel(int rssiA, int rssiB) {
            throw new RuntimeException("Stub!");
        }

        public void startLocalOnlyHotspot(android.net.wifi.WifiManager.LocalOnlyHotspotCallback callback, @Nullable Handler handler) {
            throw new RuntimeException("Stub!");
        }

        public void setTdlsEnabled(InetAddress remoteIPAddress, boolean enable) {
            throw new RuntimeException("Stub!");
        }

        public void setTdlsEnabledWithMacAddress(String remoteMacAddress, boolean enable) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public void startWps(WpsInfo config, android.net.wifi.WifiManager.WpsCallback listener) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public void cancelWps(android.net.wifi.WifiManager.WpsCallback listener) {
            throw new RuntimeException("Stub!");
        }

        public android.net.wifi.WifiManager.WifiLock createWifiLock(int lockType, String tag) {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public android.net.wifi.WifiManager.WifiLock createWifiLock(String tag) {
            throw new RuntimeException("Stub!");
        }

        public android.net.wifi.WifiManager.MulticastLock createMulticastLock(String tag) {
            throw new RuntimeException("Stub!");
        }

        public boolean isWpa3SaeSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isWpa3SuiteBSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isEnhancedOpenSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isEasyConnectSupported() {
            throw new RuntimeException("Stub!");
        }

        public boolean isWapiSupported() {
            throw new RuntimeException("Stub!");
        }

        public void registerScanResultsCallback(@NonNull Executor executor, @NonNull android.net.wifi.WifiManager.ScanResultsCallback callback) {
            throw new RuntimeException("Stub!");
        }

        public void unregisterScanResultsCallback(@NonNull android.net.wifi.WifiManager.ScanResultsCallback callback) {
            throw new RuntimeException("Stub!");
        }

        public void addSuggestionConnectionStatusListener(@NonNull Executor executor, @NonNull android.net.wifi.WifiManager.SuggestionConnectionStatusListener listener) {
            throw new RuntimeException("Stub!");
        }

        public void removeSuggestionConnectionStatusListener(@NonNull android.net.wifi.WifiManager.SuggestionConnectionStatusListener listener) {
            throw new RuntimeException("Stub!");
        }

        public boolean isScanThrottleEnabled() {
            throw new RuntimeException("Stub!");
        }

        public boolean isAutoWakeupEnabled() {
            throw new RuntimeException("Stub!");
        }

        /** @deprecated */
        @Deprecated
        public abstract static class WpsCallback {
            /** @deprecated */
            @Deprecated
            public WpsCallback() {
                throw new RuntimeException("Stub!");
            }

            /** @deprecated */
            @Deprecated
            public abstract void onStarted(String var1);

            /** @deprecated */
            @Deprecated
            public abstract void onSucceeded();

            /** @deprecated */
            @Deprecated
            public abstract void onFailed(int var1);
        }

        public class WifiLock {
            private WifiLock() {
                throw new RuntimeException("Stub!");
            }

            public void acquire() {
                throw new RuntimeException("Stub!");
            }

            public void release() {
                throw new RuntimeException("Stub!");
            }

            public void setReferenceCounted(boolean refCounted) {
                throw new RuntimeException("Stub!");
            }

            public boolean isHeld() {
                throw new RuntimeException("Stub!");
            }

            public void setWorkSource(WorkSource ws) {
                throw new RuntimeException("Stub!");
            }

            public String toString() {
                throw new RuntimeException("Stub!");
            }

            protected void finalize() throws Throwable {
                throw new RuntimeException("Stub!");
            }
        }

        public interface SuggestionConnectionStatusListener {
            void onConnectionStatus(@NonNull WifiNetworkSuggestion var1, int var2);
        }

        public abstract static class ScanResultsCallback {
            public ScanResultsCallback() {
                throw new RuntimeException("Stub!");
            }

            public abstract void onScanResultsAvailable();
        }

        public class MulticastLock {
            private MulticastLock() {
                throw new RuntimeException("Stub!");
            }

            public void acquire() {
                throw new RuntimeException("Stub!");
            }

            public void release() {
                throw new RuntimeException("Stub!");
            }

            public void setReferenceCounted(boolean refCounted) {
                throw new RuntimeException("Stub!");
            }

            public boolean isHeld() {
                throw new RuntimeException("Stub!");
            }

            public String toString() {
                throw new RuntimeException("Stub!");
            }

            protected void finalize() throws Throwable {
                throw new RuntimeException("Stub!");
            }
        }

        public class LocalOnlyHotspotReservation implements AutoCloseable {
            LocalOnlyHotspotReservation() {
                throw new RuntimeException("Stub!");
            }

            /** @deprecated */
            @Deprecated
            @Nullable
            public WifiConfiguration getWifiConfiguration() {
                throw new RuntimeException("Stub!");
            }

            @NonNull
            public SoftApConfiguration getSoftApConfiguration() {
                throw new RuntimeException("Stub!");
            }

            public void close() {
                throw new RuntimeException("Stub!");
            }

            protected void finalize() throws Throwable {
                throw new RuntimeException("Stub!");
            }
        }

        public static class LocalOnlyHotspotCallback {
            public static final int ERROR_GENERIC = 2;
            public static final int ERROR_INCOMPATIBLE_MODE = 3;
            public static final int ERROR_NO_CHANNEL = 1;
            public static final int ERROR_TETHERING_DISALLOWED = 4;

            public LocalOnlyHotspotCallback() {
                throw new RuntimeException("Stub!");
            }

            public void onStarted(android.net.wifi.WifiManager.LocalOnlyHotspotReservation reservation) {
                throw new RuntimeException("Stub!");
            }

            public void onStopped() {
                throw new RuntimeException("Stub!");
            }

            public void onFailed(int reason) {
                throw new RuntimeException("Stub!");
            }


        }
    }
