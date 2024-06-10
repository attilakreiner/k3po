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
package io.aklivity.k3po.runtime.driver.internal.netty.bootstrap.http;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelSink;
import org.jboss.netty.channel.ServerChannelFactory;

public class HttpServerChannelFactory implements ServerChannelFactory {

    private final ChannelSink channelSink;

    public HttpServerChannelFactory(HttpServerChannelSink channelSink) {
        this.channelSink = channelSink;
    }

    @Override
    public HttpServerChannel newChannel(ChannelPipeline pipeline) {
        return new HttpServerChannel(this, pipeline, channelSink);
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void releaseExternalResources() {
    }

}
