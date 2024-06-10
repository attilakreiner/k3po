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

import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelSink;
import org.jboss.netty.channel.ServerChannel;

import io.aklivity.k3po.runtime.driver.internal.netty.bootstrap.channel.AbstractChannel;
import io.aklivity.k3po.runtime.driver.internal.netty.channel.ChannelAddress;

public final class TlsChildChannel extends AbstractChannel<TlsChannelConfig> {

    TlsChildChannel(ServerChannel parent, ChannelFactory factory, ChannelPipeline pipeline, ChannelSink sink) {
        super(parent, factory, pipeline, sink, new DefaultTlsChannelConfig());
    }

    @Override
    protected void setBound() {
        super.setBound();
    }

    @Override
    protected void setConnected() {
        super.setConnected();
    }

    @Override
    protected void setLocalAddress(ChannelAddress localAddress) {
        super.setLocalAddress(localAddress);
    }

    @Override
    protected void setRemoteAddress(ChannelAddress remoteAddress) {
        super.setRemoteAddress(remoteAddress);
    }

    protected boolean setReadClosed() {
        return super.setReadClosed();
    }

    protected boolean setWriteClosed() {
        return super.setWriteClosed();
    }

    protected boolean setReadAborted() {
        return super.setReadAborted();
    }

    protected boolean setWriteAborted() {
        return super.setWriteAborted();
    }

    protected boolean isReadClosed() {
        return super.isReadClosed();
    }
}
