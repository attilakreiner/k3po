/*
 * Copyright 2024 Aklivity Inc.
 *
 * Aklivity licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.aklivity.k3po.runtime.driver.internal.ext.tls.bootstrap;

import java.io.File;

import javax.net.ssl.SSLParameters;

import io.aklivity.k3po.runtime.driver.internal.netty.bootstrap.channel.ChannelConfig;

public interface TlsChannelConfig extends ChannelConfig {

    void setParameters(SSLParameters parameters);

    SSLParameters getParameters();

    void setKeyStoreFile(File keyStoreFile);

    File getKeyStoreFile();

    void setKeyStorePassword(char[] keyStorePassword);

    char[] getKeyStorePassword();

    void setTrustStoreFile(File trustStoreFile);

    File getTrustStoreFile();

    void setTrustStorePassword(char[] trustStorePassword);

    char[] getTrustStorePassword();

    void setApplicationProtocols(String[] applicationProtocol);

    String[] getApplicationProtocols();
}
