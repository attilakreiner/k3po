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
package io.aklivity.k3po.runtime.driver.internal.behavior.handler.event;

import static io.aklivity.k3po.runtime.driver.internal.behavior.handler.event.AbstractEventHandler.ChannelEventKind.CHILD_OPEN;
import static java.util.EnumSet.of;

import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChildChannelStateEvent;

public class ChildOpenedHandler extends AbstractServerEventHandler {

    public ChildOpenedHandler() {
        super(of(CHILD_OPEN));
    }

    @Override
    public void childChannelOpen(ChannelHandlerContext ctx, ChildChannelStateEvent e) throws Exception {

        ChannelFuture handlerFuture = getHandlerFuture();
        assert handlerFuture != null;
        handlerFuture.setSuccess();
    }

    @Override
    protected StringBuilder describe(StringBuilder sb) {
        return sb.append("child opened");
    }
}
